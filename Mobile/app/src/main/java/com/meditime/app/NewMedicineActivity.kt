package com.meditime.app

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.content.ContextCompat
import androidx.core.content.FileProvider
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.timepicker.MaterialTimePicker
import com.google.android.material.timepicker.TimeFormat
import com.meditime.app.utils.BaseMenuActivity
import com.meditime.app.utils.DialogUtils
import java.io.File

class NewMedicineActivity : BaseMenuActivity() {

    private lateinit var takePictureLauncher: ActivityResultLauncher<Uri>
    private lateinit var requestCameraPermissionLauncher: ActivityResultLauncher<String>
    private var photoUri: Uri? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_new_medicine)

        setupNavigationDrawer()

        setCurrentMenuItem(R.id.nav_medicine)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        takePictureLauncher =
            registerForActivityResult(ActivityResultContracts.TakePicture()) { success -> }

        requestCameraPermissionLauncher =
            registerForActivityResult(ActivityResultContracts.RequestPermission()) { isGranted ->
                if (isGranted) {
                    openCameraInternal()
                } else {
                    Toast.makeText(
                        this,
                        getString(R.string.new_medicine_camera_denied),
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }

        val timeEditText = findViewById<TextInputEditText>(R.id.timeEditText)

        timeEditText.setOnClickListener {
            showTimePicker { hour, minute ->
                val formatted = String.format("%02d:%02d", hour, minute)
                timeEditText.setText(formatted)
            }
        }

        timeEditText.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus) {
                timeEditText.clearFocus() // Remove focus to prevent cursor
                showTimePicker { hour, minute ->
                    val formatted = String.format("%02d:%02d", hour, minute)
                    timeEditText.setText(formatted)
                }
            }
        }

        findViewById<TextView>(R.id.titleText).text = getString(R.string.new_medicine_title)
    }

    fun goBackToMedicineActivity(view: View) {
        val intent = Intent(this, MedicineActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
        startActivity(intent)
    }

    fun showDialogConfirm(view: View) {
        DialogUtils.showCustomDialog(
            context = this,
            title = getString(R.string.dialog_title_new_medicine),
            message = getString(R.string.dialog_message_new_medicine)
        ) {
            val intent = Intent(this, MedicineActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)
        }
    }

    fun openCamera(view: View) {
        if (ContextCompat.checkSelfPermission(this, android.Manifest.permission.CAMERA)
            == PackageManager.PERMISSION_GRANTED
        ) {
            openCameraInternal()
        } else {
            requestCameraPermissionLauncher.launch(android.Manifest.permission.CAMERA)
        }
    }

    fun openCameraInternal() {
        val photoFile = File.createTempFile("med_photo_", ".jpg", cacheDir)
        photoUri = FileProvider.getUriForFile(
            this,
            "${packageName}.fileprovider",
            photoFile
        )

        photoUri?.let { takePictureLauncher.launch(it) }
    }

    fun showTimePicker(onTimePicked: (Int, Int) -> Unit) {
        val picker = MaterialTimePicker.Builder()
            .setTimeFormat(TimeFormat.CLOCK_12H)
            .setInputMode(MaterialTimePicker.INPUT_MODE_KEYBOARD)
            .setHour(12)
            .setMinute(0)
            .setTitleText(getString(R.string.new_medicine_time_picker_title))
            .build()

        picker.show(supportFragmentManager, "timePicker")

        picker.addOnPositiveButtonClickListener {
            onTimePicked(picker.hour, picker.minute)
        }
    }
}
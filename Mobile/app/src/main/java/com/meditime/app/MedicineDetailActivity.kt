package com.meditime.app

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.meditime.app.utils.BaseMenuActivity

class MedicineDetailActivity : BaseMenuActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_medicine_detail)

        // Set up navigation drawer
        setupNavigationDrawer()

        // Set the current menu item as selected (assuming this is the medicine/main screen)
        setCurrentMenuItem(R.id.nav_medicine)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<TextView>(R.id.titleText).text = getString(R.string.medicine_detail_title)
    }

    fun goBackToMedicineActivity(view: View) {
        val intent = Intent(this, MedicineActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
        startActivity(intent)
    }

    fun showConfirmationDialog(view: View) {
        val dialog = MaterialAlertDialogBuilder(this)
            .setTitle(getString(R.string.medicine_detail_delete_confirm_title))
            .setMessage(getString(R.string.medicine_detail_delete_confirm_message))
            .setPositiveButton(getString(R.string.medicine_detail_delete)) { dialog, _ ->
                val intent = Intent(this, MedicineActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
                startActivity(intent)
            }
            .setNegativeButton(getString(R.string.medicine_detail_back)) { dialog, _ -> dialog.dismiss() }
            .create()

        dialog.window?.setBackgroundDrawableResource(android.R.color.transparent)
        dialog.setOnShowListener {
            dialog.findViewById<View>(android.R.id.content)?.background =
                ContextCompat.getDrawable(this, R.drawable.dialog_background)

            dialog.getButton(AlertDialog.BUTTON_POSITIVE)?.setTextColor(
                ContextCompat.getColor(this, android.R.color.black)
            )
            dialog.getButton(AlertDialog.BUTTON_NEGATIVE)?.setTextColor(
                ContextCompat.getColor(this, android.R.color.black)
            )
        }

        dialog.show()
    }

    fun navigateToAlarm(view: View){
        val intent = Intent(this, AlarmActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
        startActivity(intent)
    }

    fun navigateToMedicineFollowUp(view: View){
        val intent = Intent(this, MedicineFollowUpActivity::class.java)
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
        startActivity(intent)
    }
}
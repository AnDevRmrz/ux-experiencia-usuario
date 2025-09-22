package com.meditime.app

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.meditime.app.utils.BaseMenuActivity

class PrincipalActivity : BaseMenuActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_principal)

        // Set up navigation drawer
        setupNavigationDrawer()

        // Set the current menu item as selected (assuming this is the medicine/main screen)
        setCurrentMenuItem(R.id.nav_home)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<TextView>(R.id.titleText).text = getString(R.string.principal_title)

        // Set click events
        setClickEventToPanels()
    }

    fun setClickEventToPanels() {
        val ctnMedicine = findViewById<LinearLayout>(R.id.ctnMedicinePrincipal)
        val ctnSettings = findViewById<LinearLayout>(R.id.ctnSettingsPrincipal)

        ctnMedicine.setOnClickListener {
            val intent = Intent(this, MedicineActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)
        }

        ctnSettings.setOnClickListener {
            val intent = Intent(this, SettingsActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)
        }
    }
}
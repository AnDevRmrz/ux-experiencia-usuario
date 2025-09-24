package com.meditime.app.utils

import android.content.Intent
import android.content.res.ColorStateList
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import com.google.android.material.search.SearchBar
import com.meditime.app.R
import androidx.appcompat.app.AppCompatActivity
import com.meditime.app.MainActivity
import com.meditime.app.MedicineActivity
import com.meditime.app.PrincipalActivity
import com.meditime.app.SettingsActivity

abstract class BaseMenuActivity : AppCompatActivity(),
    NavigationView.OnNavigationItemSelectedListener {

    protected lateinit var drawerLayout: DrawerLayout
    protected var searchBar: SearchBar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    protected fun setupNavigationDrawer() {
        try {
            drawerLayout = findViewById<DrawerLayout>(R.id.drawer_layout)
            val navigationView = findViewById<NavigationView>(R.id.nav_view)

            navigationView?.setNavigationItemSelectedListener(this)

            navigationView?.itemIconTintList = null

            searchBar = findViewById<SearchBar>(R.id.searchTopBar)
            searchBar?.setNavigationOnClickListener {
                drawerLayout.openDrawer(GravityCompat.START)
            }
        } catch (e: Exception) {
        }
    }

    // Method to set the current menu item as selected
    protected fun setCurrentMenuItem(menuItemId: Int) {
        try {
            val navigationView = findViewById<NavigationView>(R.id.nav_view)
            navigationView?.setCheckedItem(menuItemId)
        } catch (e: Exception) {
            Log.e("BaseMenuActivity", "Error setting menu item: ${e.message}")
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Set the selected item as checked
        item.isChecked = true

        when (item.itemId) {
            R.id.nav_home -> {
                if (this !is PrincipalActivity) {
                    val intent = Intent(this, PrincipalActivity::class.java)
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
                    startActivity(intent)
                }
            }

            R.id.nav_medicine -> {
                if (this !is MedicineActivity) {
                    val intent = Intent(this, MedicineActivity::class.java)
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
                    startActivity(intent)
                }
            }

            R.id.nav_settings -> {
                if (this !is SettingsActivity) {
                    val intent = Intent(this, SettingsActivity::class.java)
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
                    startActivity(intent)
                }
            }

            R.id.nav_logout -> {
                val intent = Intent(this, MainActivity::class.java)
                finish()
                startActivity(intent)
            }
        }

        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onBackPressed() {
        if (::drawerLayout.isInitialized && drawerLayout.isDrawerOpen(GravityCompat.START)) {
            drawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }
}

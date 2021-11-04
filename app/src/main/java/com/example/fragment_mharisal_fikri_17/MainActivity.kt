package com.example.fragment_mharisal_fikri_17

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.fragment_mharisal_fikri_17.fragment.HomeFragment
import com.example.fragment_mharisal_fikri_17.fragment.NotificationsFragment
import com.example.fragment_mharisal_fikri_17.fragment.SettingsFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = HomeFragment()
        val notificationsFragment = NotificationsFragment()
        val settingsFragment = SettingsFragment()

        makeCurrentFragment(homeFragment)

        val bottom_nafigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        bottom_nafigation.setOnNavigationItemSelectedListener{
            when (it.itemId){
                R.id.menu_home -> makeCurrentFragment(homeFragment)
                R.id.menu_notivication -> makeCurrentFragment(notificationsFragment)
                R.id.menu_settings -> makeCurrentFragment(settingsFragment)
            }
            true
        }

    }

    private fun makeCurrentFragment(fragment : Fragment ) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fram_nav, fragment)
            commit()
        }
    }
}
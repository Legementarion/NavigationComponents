package com.example.lego.myapplication

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.fragment.NavHostFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val finalHost = NavHostFragment.create(R.navigation.nav_main)

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                finalHost.navController.navigate(R.id.homeFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {
                finalHost.navController.navigate(R.id.dashboardFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                finalHost.navController.navigate(R.id.notificationFragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportFragmentManager.beginTransaction()
                .replace(R.id.my_nav_host_fragment, finalHost)
                .commit()

        navigationBar.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }

    override fun onStart() {
        super.onStart()
        finalHost.navController.addOnNavigatedListener{ navController: NavController, navDestination: NavDestination ->
            val tab = navDestination.defaultArguments.getInt(ARG_PARAM_TAB)
            navigationBar.menu.getItem(tab).isChecked = true
        }
    }
}

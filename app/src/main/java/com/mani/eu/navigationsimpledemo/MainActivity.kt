package com.mani.eu.navigationsimpledemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI

class MainActivity : AppCompatActivity() {

    // TODO Step 1: Make the navController variable global.
    // START
    private lateinit var navController: NavController
    // END

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navController = Navigation.findNavController(this@MainActivity, R.id.fragment)
        NavigationUI.setupActionBarWithNavController(this@MainActivity, navController)
    }

    // TODO Step 2: Override the below method and pass the navController variable in it. After doing this the back button will be enable.
    // START
    override fun onSupportNavigateUp(): Boolean {
        return NavigationUI.navigateUp(navController, null)
    }
    // END
}
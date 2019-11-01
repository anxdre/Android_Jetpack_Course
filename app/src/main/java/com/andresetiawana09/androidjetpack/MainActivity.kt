package com.andresetiawana09.androidjetpack

import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController
    private var doubleBackToExitPressedOnce = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navController = Navigation.findNavController(this, R.id.fragment)
        bt_main.setupWithNavController(navController)
        NavigationUI.setupActionBarWithNavController(this, navController)
    }

    override fun onSupportNavigateUp(): Boolean {
        bt_main.visibility = View.VISIBLE
        return NavigationUI.navigateUp(navController, null)
    }

    override fun onBackPressed() {
        bt_main.visibility = View.VISIBLE
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed()
            return
        } else if (fragment.isInLayout) {
            NavigationUI.navigateUp(navController, null)
            this.doubleBackToExitPressedOnce = true
            Handler().postDelayed({ doubleBackToExitPressedOnce = false }, 1000)
        }
    }
}

package com.mines_csci448

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.mines_csci448.databinding.ActivityMainBinding
import com.mines_csci448.databinding.FragmentStartScreenBinding

private const val LOG_TAG = "MinesGO: Main Activity"

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    companion object{
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(LOG_TAG, "onCreate() called")
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //TODO: Set NavHost Fragment
        //val navHostFragment = supportFragmentManager.findFragmentById()
       // NavigationUI.setupActionBarWithNavController(this, navHostFragment.navController)
        //Fragment Transaction to startScreen.kt
            // var startFragment = supportFragmentManager.findFragmentById()
    }
    override fun onStart() {
        Log.d(LOG_TAG, "onStart() called")
        super.onStart()
    }
    override fun onResume() {
        Log.d(LOG_TAG, "onResume() called")
        super.onResume()
    }
    override fun onPause() {
        Log.d(LOG_TAG, "onPause() called")
        super.onPause()
    }
    override fun onStop() {
        Log.d(LOG_TAG, "onStop() called")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(LOG_TAG, "onDestroy() called")
        super.onDestroy()
    }

}
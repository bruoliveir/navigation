package com.bruoliveir.navigation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupTitleFromDestination()
    }

    private fun setupTitleFromDestination() {
        Navigation.findNavController(this, R.id.fNavHost).addOnDestinationChangedListener { controller, _, _ ->
            title = controller.currentDestination?.label
        }
    }
}

package com.example.lego.myapplication

import android.os.Bundle
import android.view.View
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment.*

class HomeFragment2: ColorNumberFragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonForward.text = getString(R.string.back)
        buttonForward.setOnClickListener {
            val action = HomeFragment2Directions.actionHomeFragment2ToHomeFragment()
            Navigation.findNavController(it).navigate(action)
        }

        buttonLeft.setOnClickListener {
            val action = HomeFragment2Directions.actionHomeFragment2ToNotificationFragment2()
            Navigation.findNavController(it).navigate(action)
        }
        buttonRight.setOnClickListener {
            val action = HomeFragment2Directions.actionHomeFragment2ToDashboardFragment2()
            Navigation.findNavController(it).navigate(action)
        }
    }

}
package com.example.lego.myapplication

import android.os.Bundle
import android.view.View
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment.*

class HomeFragment : ColorNumberFragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonForward.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToHomeFragment2()
            Navigation.findNavController(it).navigate(action)
        }
        buttonLeft.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToNotificationFragment()
            Navigation.findNavController(it).navigate(action)
        }
        buttonRight.setOnClickListener {
            val action = HomeFragmentDirections.actionHomeFragmentToDashboardFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }
}
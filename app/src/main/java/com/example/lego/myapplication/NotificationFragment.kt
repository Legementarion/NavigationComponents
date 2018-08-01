package com.example.lego.myapplication

import android.os.Bundle
import android.view.View
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment.*

class NotificationFragment: ColorNumberFragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonForward.setOnClickListener {
            val action = NotificationFragmentDirections.actionNotificationFragmentToNotificationFragment2()
            Navigation.findNavController(it).navigate(action)
        }
        buttonLeft.setOnClickListener {
            val action = NotificationFragmentDirections.actionNotificationFragmentToDashboardFragment()
            Navigation.findNavController(it).navigate(action)
        }
        buttonRight.setOnClickListener {
            val action = NotificationFragmentDirections.actionNotificationFragmentToHomeFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }

}
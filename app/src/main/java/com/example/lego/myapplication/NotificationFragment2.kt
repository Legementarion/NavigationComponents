package com.example.lego.myapplication

import android.os.Bundle
import android.view.View
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment.*

class NotificationFragment2 : ColorNumberFragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonForward.text = getString(R.string.back)
        buttonForward.setOnClickListener {
            val action = NotificationFragment2Directions.actionNotificationFragment2ToNotificationFragment()
            action.setAmount(1010)
            Navigation.findNavController(it).navigate(action)
        }
        buttonLeft.setOnClickListener {
            val action = NotificationFragment2Directions.actionNotificationFragment2ToDashboardFragment2()
            Navigation.findNavController(it).navigate(action)
        }
        buttonRight.setOnClickListener {
            val action = NotificationFragment2Directions.actionNotificationFragment2ToHomeFragment2()
            Navigation.findNavController(it).navigate(action)
        }
    }
}
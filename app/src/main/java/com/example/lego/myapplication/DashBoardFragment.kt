package com.example.lego.myapplication

import android.os.Bundle
import android.view.View
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment.*

class DashBoardFragment: ColorNumberFragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonForward.setOnClickListener {
            val action = DashBoardFragmentDirections.actionDashboardFragmentToDashboardFragment2()
            Navigation.findNavController(it).navigate(action)
        }
        buttonLeft.setOnClickListener {
            val action = DashBoardFragmentDirections.actionDashboardFragmentToHomeFragment()
            Navigation.findNavController(it).navigate(action)
        }
        buttonRight.setOnClickListener {
            val action = DashBoardFragmentDirections.actionDashboardFragmentToNotificationFragment()
            Navigation.findNavController(it).navigate(action)
        }
    }

}
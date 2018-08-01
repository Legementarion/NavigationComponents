package com.example.lego.myapplication

import android.os.Bundle
import android.view.View
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment.*

class DashboardFragment2 : ColorNumberFragment() {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        buttonForward.text = getString(R.string.back)
        buttonForward.setOnClickListener {
            val bundle = Bundle().apply { putInt(ARG_PARAM_AMOUNT, 42) }
            Navigation.findNavController(it).navigate(R.id.actionDashboardFragment2ToDashboardFragment, bundle)
        }
        buttonLeft.setOnClickListener {
            val action = DashboardFragment2Directions.actionDashboardFragment2ToHomeFragment2()
            Navigation.findNavController(it).navigate(action)
        }
        buttonRight.setOnClickListener {
            val action = DashboardFragment2Directions.actionDashboardFragment2ToNotificationFragment2()
            Navigation.findNavController(it).navigate(action)
        }
    }

}
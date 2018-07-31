package com.example.lego.myapplication

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_color_number.*

const val ARG_PARAM_COLOR = "color"
const val ARG_PARAM_AMOUNT = "amount"

class ColorNumberFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_color_number, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            fragmentContainer.setBackgroundColor(Color.parseColor(it.getString(ARG_PARAM_COLOR)))
            textView.text = it.getString(ARG_PARAM_AMOUNT)
        }

        buttonForward.setOnClickListener {
            val action = ColorNumberFragmentDirections.actionNotificationrFragmentToColorNumberFragment6()
            Navigation.findNavController(it).navigate(action)
        }
    }

}

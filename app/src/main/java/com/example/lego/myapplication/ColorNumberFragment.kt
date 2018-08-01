package com.example.lego.myapplication

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment.*

const val ARG_PARAM_COLOR = "color"
const val ARG_PARAM_AMOUNT = "amount"
const val ARG_PARAM_TAB = "tab"

open class ColorNumberFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            fragmentContainer.setBackgroundColor(Color.parseColor(it.getString(ARG_PARAM_COLOR)))
            textView.text = it.getInt(ARG_PARAM_AMOUNT).toString()
        }
    }

}

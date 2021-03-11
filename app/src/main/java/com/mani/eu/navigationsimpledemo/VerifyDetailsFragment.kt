package com.mani.eu.navigationsimpledemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class VerifyDetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // TODO Step 5: Get the arguments from the bundle.
        // START
        val name = arguments?.getString("name")
        val mobileNumber = arguments?.getLong("mobile")
        // END

        // TODO Step 7: Map the XML components and assign the values to it.
        // START
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_verify_details, container, false)

        val tvName = rootView.findViewById<TextView>(R.id.tv_name)
        val tvMobileNumber = rootView.findViewById<TextView>(R.id.tv_mobile_number)

        tvName.text= name
        tvMobileNumber.text= mobileNumber.toString()

        return rootView
        // END
    }
}
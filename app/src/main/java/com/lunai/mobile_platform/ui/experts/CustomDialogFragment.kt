package com.lunai.mobile_platform.ui.experts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.lunai.mobile_platform.R

class CustomDialogFragment(expertLayout: Int) : DialogFragment() {

    private val expertLayout = expertLayout

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {

        return inflater.inflate(expertLayout, container, false)
    }

}


package com.lunai.mobile_platform.ui.experts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.lunai.mobile_platform.R
import com.lunai.mobile_platform.databinding.FragmentExpertsBinding
import kotlinx.android.synthetic.main.fragment_experts.*

class ExpertsFragment : Fragment() {

    private lateinit var expertsViewModel: ExpertsViewModel
    private var _binding: FragmentExpertsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        expertsViewModel =
            ViewModelProvider(this).get(ExpertsViewModel::class.java)

        _binding = FragmentExpertsBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        txv_partner.setOnClickListener {
            val layout = R.layout.experts_popup
            val showPopup = CustomDialogFragment(layout)
            showPopup.show(parentFragmentManager, "popupWindow")
        }


        txv_partner_5.setOnClickListener {
            val layout = R.layout.experts_popup2
            val showPopup = CustomDialogFragment(layout)
            showPopup.show(parentFragmentManager, "popupWindow")
        }

        txv_partner_13.setOnClickListener {
            val layout = R.layout.experts_popup3
            val showPopup = CustomDialogFragment(layout)
            showPopup.show(parentFragmentManager, "popupWindow")
        }

        txv_partner_9.setOnClickListener {
            val layout = R.layout.experts_popup
            val showPopup = CustomDialogFragment(layout)
            showPopup.show(parentFragmentManager, "popupWindow")
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
package com.lunai.mobile_platform.ui.experts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.lunai.mobile_platform.databinding.FragmentExpertsBinding

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
        val root: View = binding.root

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
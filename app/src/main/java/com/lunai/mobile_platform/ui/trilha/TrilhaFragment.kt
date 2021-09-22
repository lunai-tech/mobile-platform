package com.lunai.mobile_platform.ui.trilha

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.lunai.mobile_platform.databinding.FragmentTrilhaBinding

class TrilhaFragment : Fragment() {

    private lateinit var trilhaViewModel: TrilhaViewModel
    private var _binding: FragmentTrilhaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        trilhaViewModel =
            ViewModelProvider(this).get(TrilhaViewModel::class.java)

        _binding = FragmentTrilhaBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textNotifications
        trilhaViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
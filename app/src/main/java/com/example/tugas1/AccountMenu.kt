package com.example.tugas1

import android.annotation.SuppressLint
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.tugas1.databinding.FragmentAccountMenuBinding

class AccountMenu : Fragment() {
    private var _binding: FragmentAccountMenuBinding? = null
    private val binding get() = _binding!!

    @SuppressLint("SuspiciousIndentation")
    private fun initViews(){
        if (activity != null && context != null){
            with(binding){
                btnImplicit.setOnClickListener{
                    val intentImplicit =
                        Intent(Intent.ACTION_VIEW, Uri.parse(
                            "https://www.instagram.com/lutfi.np/"
                        ))
                        startActivity(intentImplicit)
                    }
                }
            }
        }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAccountMenuBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }
}
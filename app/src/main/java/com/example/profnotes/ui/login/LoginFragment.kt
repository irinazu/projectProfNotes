package com.example.profnotes.ui.login

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import com.example.profnotes.MainActivity
import com.example.profnotes.R
import com.example.profnotes.databinding.FragmentLoginBinding
import com.example.profnotes.ui.core.spanString

class LoginFragment:Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tvLoginWithoutAccount.apply {
            text = text.spanString(
                startIndex = 4,
                endIndex = 24,
                color = requireContext().getColor(R.color.green)
            )
        }
        binding.tvForgotPassword.apply {
            text = text.spanString(
                startIndex = 24,
                endIndex = 43,
                color = requireContext().getColor(R.color.yellow)
            )
        }

        binding.btnLogin.setOnClickListener(object :View.OnClickListener{
            override fun onClick(p0: View?) {

            }
        })

        binding.btnLogin.apply {
            isEnabled = true
            setOnClickListener {
                findNavController(binding.root)
                    .navigate(R.id.action_loginFragment_to_navigation_home)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }


}
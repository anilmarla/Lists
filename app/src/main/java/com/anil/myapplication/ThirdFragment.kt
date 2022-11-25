package com.anil.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.anil.myapplication.databinding.FragmentThridBinding
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

/**
 * A simple [Fragment] subclass.
 * Use the [ThirdFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ThirdFragment : Fragment() {
    private lateinit var binding: FragmentThridBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            val name = it.getString("name")
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentThridBinding.inflate(inflater, container, false)
        //val view = inflater.inflate(R.layout.fragment_thrid, container, false)
        binding.btnThirdFragment.setOnClickListener {
            Toast.makeText(context, "Clicked third fragment", Toast.LENGTH_SHORT).show()

        }

        binding.btnEnter.setOnClickListener {

            val email = binding.enterEmailText.text.toString()
            val password = binding.enterPasswordText.text.toString()


            if (email.isBlank()) {
                binding.inputEmail.error =
                    "Please enter valid email"
            } else {
                binding.inputEmail.error = null
            }

            if (password.isBlank()) {
                binding.inputPassword.error =
                    "Please enter valid password"
            } else {
                binding.inputPassword.error = null
            }


            if (email == "abc" && password == "abc") {
                val intent = Intent(context, MainActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(context, "Invalid Credentials ", Toast.LENGTH_SHORT).show()
            }

            test()
        }
        return binding.root

    }

    private fun test() {
        val name: String? = "Ravi"
        val email: String? = "xx@xx.com"

        name?.let { n ->
            Toast.makeText(context, "name length ${n.length}", Toast.LENGTH_SHORT).show()
        } ?: run {
            Toast.makeText(context, "Name is null", Toast.LENGTH_SHORT).show()
        }

    }

    companion object {

        fun newInstance(param1: String) =
            ThirdFragment().apply {
                arguments = Bundle().apply {
                    putString("name", param1)
                }
            }
    }
}
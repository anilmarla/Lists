package com.anil.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.anil.myapplication.databinding.ActivityNewBinding
import com.bumptech.glide.Glide

class NewActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        }


    }
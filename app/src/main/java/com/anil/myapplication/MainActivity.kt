package com.anil.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.anil.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // loading second fragment
        loadSecondFragment()
     }

    private fun loadSecondFragment() {
        val secondFragment = SecondFragment.newInstance("Message from main activity")

        supportFragmentManager.beginTransaction()
            .replace(R.id.container_two, secondFragment)
            .commit()
    }
}
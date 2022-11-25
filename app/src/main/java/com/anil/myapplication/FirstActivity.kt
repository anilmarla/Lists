package com.anil.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anil.myapplication.databinding.ActivityNewBinding

class FirstActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        loadThirdFragment()
    }

    private fun loadThirdFragment() {
        val thirdFragment = ThirdFragment.newInstance("this is from thrid fragment")

        supportFragmentManager.beginTransaction()
            .replace(R.id.container, thirdFragment)
            .commit()
    }
}
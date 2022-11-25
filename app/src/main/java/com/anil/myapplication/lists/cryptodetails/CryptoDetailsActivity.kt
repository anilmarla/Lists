package com.anil.myapplication.lists.cryptodetails

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anil.myapplication.R
import com.anil.myapplication.databinding.ActivityCryptoDetailsBinding
import com.anil.myapplication.lists.crypto.Crypto

class CryptoDetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCryptoDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCryptoDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val crypto = intent?.getParcelableExtra<Crypto>("data")

        crypto?.let {
            binding.title.text = it.title
            binding.subTitle.text = it.subtitle
            binding.timeStamp.text = it.date
        }

        /*val title = intent?.extras?.getString("title")
        val subtitle = intent?.extras?.getString("subtitle")
        val date = intent?.extras?.getString("timestamp")*/


    }
}
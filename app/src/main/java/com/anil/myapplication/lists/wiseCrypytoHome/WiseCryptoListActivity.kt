package com.anil.myapplication.lists.wiseCrypytoHome

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.anil.myapplication.databinding.ActivityWiseCryptoListBinding

class WiseCryptoListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWiseCryptoListBinding
    private lateinit var adapter: WiseCryptoListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWiseCryptoListBinding.inflate(layoutInflater)

        setContentView(binding.root)

        adapter = WiseCryptoListAdapter()

        binding.recyclerview.adapter = adapter

        val details = mutableListOf<WiseCrypto>()

        details.add(
            WiseCrypto(
                "https://c8.alamy.com/comp/MP8EPJ/bitcoin-btc-coin-with-logo-isolated-on-white-background-MP8EPJ.jpg",
                "BITCOIN",
                "bitcoin",
                "15.2%",
                "13.2"
            )
        )
        details.add(
            WiseCrypto(
                "https://s2.coinmarketcap.com/static/img/coins/200x200/1027.png",
                "ETH",
                "Ethereum",
                "0.009%",
                "39.30"
            )
        )
        details.add(
            WiseCrypto(
                "https://c8.alamy.com/comp/MP8EPJ/bitcoin-btc-coin-with-logo-isolated-on-white-background-MP8EPJ.jpg",
                "BITCOIN",
                "bitcoin",
                "15.2%",
                "13.2"
            )
        )
        details.add(
            WiseCrypto(
                "https://s2.coinmarketcap.com/static/img/coins/200x200/1027.png",
                "ETH",
                "Ethereum",
                "0.009%",
                "39.30"
            )
        )
        details.add(
            WiseCrypto(
                "https://c8.alamy.com/comp/MP8EPJ/bitcoin-btc-coin-with-logo-isolated-on-white-background-MP8EPJ.jpg",
                "BITCOIN",
                "bitcoin",
                "15.2%",
                "13.2"
            )
        )
        details.add(
            WiseCrypto(
                "https://s2.coinmarketcap.com/static/img/coins/200x200/1027.png",
                "ETH",
                "Ethereum",
                "0.009%",
                "39.30"
            )
        )
        details.add(
            WiseCrypto(
                "https://c8.alamy.com/comp/MP8EPJ/bitcoin-btc-coin-with-logo-isolated-on-white-background-MP8EPJ.jpg",
                "BITCOIN",
                "bitcoin",
                "15.2%",
                "13.2"
            )
        )
        details.add(
            WiseCrypto(
                "https://s2.coinmarketcap.com/static/img/coins/200x200/1027.png",
                "ETH",
                "Ethereum",
                "0.009%",
                "39.30"
            )
        )
        details.add(
            WiseCrypto(
                "https://c8.alamy.com/comp/MP8EPJ/bitcoin-btc-coin-with-logo-isolated-on-white-background-MP8EPJ.jpg",
                "BITCOIN",
                "bitcoin",
                "15.2%",
                "13.2"
            )
        )
        details.add(
            WiseCrypto(
                "https://s2.coinmarketcap.com/static/img/coins/200x200/1027.png",
                "ETH",
                "Ethereum",
                "0.009%",
                "39.30"
            )
        )
        details.add(
            WiseCrypto(
                "https://c8.alamy.com/comp/MP8EPJ/bitcoin-btc-coin-with-logo-isolated-on-white-background-MP8EPJ.jpg",
                "BITCOIN",
                "bitcoin",
                "15.2%",
                "13.2"
            )
        )
        details.add(
            WiseCrypto(
                "https://s2.coinmarketcap.com/static/img/coins/200x200/1027.png",
                "ETH",
                "Ethereum",
                "0.009%",
                "39.30"
            )
        )

        adapter.submitList(details)
    }
}
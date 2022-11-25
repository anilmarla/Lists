package com.anil.myapplication.lists.crypto

import CryptoListAdapter
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anil.myapplication.R
import com.anil.myapplication.databinding.ActivityCryptoListBinding
import com.anil.myapplication.lists.cryptodetails.CryptoDetailsActivity

class CryptoListActivity : AppCompatActivity(), CryptoListAdapterListener {
    private lateinit var binding: ActivityCryptoListBinding
    private lateinit var adapter: CryptoListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCryptoListBinding.inflate(layoutInflater)

        setContentView(binding.root)

        adapter = CryptoListAdapter(this)

        binding.recyclerview.adapter = adapter

        // recyclerview decoration

        // adding space between items

        val crypto = mutableListOf<Crypto>()

        crypto.add(
            Crypto(
                R.drawable.icon1,
                "Portofolio Meningkat",
                "Kenaikan aset Bitcoin sebesar 1.1% ",
                "29 November 2021 (13.00)"
            )
        )
        crypto.add(
            Crypto(
                R.drawable.icon2,
                "Transaksi Berhasil",
                "Pembelian bitcoin senilai 0,00001 berhasil dialakukan",
                "29 November 2021 (13.00)"
            )
        )
        crypto.add(
            Crypto(
                R.drawable.icon3,
                "Transaksi Diproses",
                "Pengisian saldo senilai $10 menunggu pembayaran",
                "29 November 2021 (13.00)"
            )
        )
        crypto.add(
            Crypto(
                R.drawable.icon2,
                "Pembayaran Berhasil",
                "Pengisian saldo senilai $10 berhasil dilakukan",
                "29 November 2021 (13.00)"
            )
        )
        crypto.add(
            Crypto(
                R.drawable.icon4,
                "Transaksi Gagal",
                "Pengisian saldo senilai $10 gagal ",
                "29 November 2021 (13.00)"
            )
        )

        adapter.submitList(crypto)
    }


    override fun onCardClicked(crypto: Crypto) {
        /*startActivity(Intent(this, CryptoDetailsActivity::class.java).apply{
            putExtra("timestamp", crypto.date)
            putExtra("title", crypto.title )
            putExtra("subtitle",crypto.subtitle )
        })*/
        val intent = Intent(this, CryptoDetailsActivity::class.java).apply {
            putExtra("data", crypto)
        }
        startActivity(intent)

        // intent.putExtra("timestamp", crypto.date)
        // intent.putExtra("title", crypto.title )
        // intent.putExtra("subtitle",crypto.subtitle )


    }

//    override fun onCardClicked(crypto: Crypto) {
//        Toast.makeText(this, "You are clicked ${crypto.title}", Toast.LENGTH_SHORT).show()
//    }

//    override fun onTitleClicked(crypto: Crypto) {
//
//    }
//
//    override fun onDateClicked(crypto: Crypto) {
//        Toast.makeText(this, "You Clicked the time ${crypto.date} ", Toast.LENGTH_SHORT).show()
//    }
}
package com.anil.myapplication.lists.wiseCrypytoHome

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.anil.myapplication.databinding.ListItemWisecryptoBinding
import com.bumptech.glide.Glide

class WiseCryptoListAdapter :
    ListAdapter<WiseCrypto, WiseCryptoListAdapter.WiseCryptoViewHolder>(WiseCryptoDiffCallback()) {
    inner class WiseCryptoViewHolder(val binding: ListItemWisecryptoBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(wiseCrypto: WiseCrypto) {
            binding.txtBtc.text = wiseCrypto.textbig
            binding.txtBitcoin.text = wiseCrypto.textsmall
            binding.presentValue.text = wiseCrypto.textportfolio
            binding.dayProfit.text = wiseCrypto.percentage

            Glide.with(binding.imagBitcoin.context).load(wiseCrypto.image).into(binding.imagBitcoin)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WiseCryptoViewHolder {
        return WiseCryptoViewHolder(
            ListItemWisecryptoBinding.inflate(
                LayoutInflater.from(parent.context),
                parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: WiseCryptoViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}
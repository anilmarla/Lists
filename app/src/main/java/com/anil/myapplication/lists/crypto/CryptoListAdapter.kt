package com.anil.myapplication.lists.crypto

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.anil.myapplication.databinding.ListItemCryptoBinding
import com.bumptech.glide.Glide

class CryptoListAdapter(val listener: CryptoListAdapterListener) :
    ListAdapter<Crypto, CryptoListAdapter.CryptoViewHolder>(CryptoDiffCallback()) {

    inner class CryptoViewHolder(val binding: ListItemCryptoBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(crypto: Crypto) {
            Glide.with(binding.root.context)
                .load(crypto.logo)
                .into(binding.smallcardLogo)

            binding.textTitle.text = crypto.title
            binding.textSubTittle.text = crypto.subtitle
            binding.textDate.text = crypto.date

            binding.bigCard.setOnClickListener {
                listener.onCardClicked(crypto)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CryptoViewHolder {
        val binding = ListItemCryptoBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return CryptoViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CryptoViewHolder, position: Int) {
        val item = getItem(position)
        holder.bind(item)
    }
}
package com.anil.myapplication.lists.crypto

import androidx.recyclerview.widget.DiffUtil

class CryptoDiffCallback :DiffUtil.ItemCallback<Crypto>(){
    override fun areItemsTheSame(oldItem: Crypto, newItem: Crypto): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Crypto, newItem: Crypto): Boolean {
        return oldItem == newItem
    }

}

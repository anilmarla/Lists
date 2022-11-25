package com.anil.myapplication.lists.wiseCrypytoHome

import androidx.recyclerview.widget.DiffUtil

class WiseCryptoDiffCallback : DiffUtil.ItemCallback<WiseCrypto>() {
    override fun areItemsTheSame(oldItem: WiseCrypto, newItem: WiseCrypto): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: WiseCrypto, newItem: WiseCrypto): Boolean {
        return oldItem == newItem
    }
}

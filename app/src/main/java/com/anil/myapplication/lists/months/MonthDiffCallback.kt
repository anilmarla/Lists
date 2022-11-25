package com.anil.myapplication.lists.months

import androidx.recyclerview.widget.DiffUtil

class MonthDiffCallback : DiffUtil.ItemCallback<Month>() {
    override fun areItemsTheSame(oldItem: Month, newItem: Month): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Month, newItem: Month): Boolean {
        return oldItem == newItem
    }
}
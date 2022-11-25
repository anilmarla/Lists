package com.anil.myapplication.lists.numbers

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.anil.myapplication.databinding.ListItemNumbersBinding

class NumberListAdapter: ListAdapter<Int, NumberListAdapter.NumberViewHolder>(NumberDiffCallback()) {
    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.setData(getItem(position))
    }

    inner class NumberViewHolder(val binding: ListItemNumbersBinding) : RecyclerView.ViewHolder(binding.root){
        fun setData(number: Int){
            binding.numbers.text = number.toString()

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        return NumberViewHolder(
            binding = ListItemNumbersBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }
}

class NumberDiffCallback : DiffUtil.ItemCallback<Int>(){
    override fun areItemsTheSame(oldItem: Int, newItem: Int): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Int, newItem: Int): Boolean {
        return oldItem == newItem
    }
}

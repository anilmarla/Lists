package com.anil.myapplication.lists.months

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.anil.myapplication.databinding.ListItemMonthsBinding
import com.bumptech.glide.Glide

class MonthListAdapter(val listener: MonthListAdapterListener) : ListAdapter<Month, MonthListAdapter.MyViewHolder>(MonthDiffCallback()) {

    inner class MyViewHolder(val binding: ListItemMonthsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(month: Month, position: Int) {
            binding.name.text = month.name

            Glide.with(binding.root.context)
                .load(month.image)
                .centerCrop()
                .into(binding.imageMonth)

            binding.root.setOnClickListener {
                listener.onCardClicked(month, position)
            }

            binding.name.setOnClickListener {
                listener.onTitleClicked()
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding =
            ListItemMonthsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        val holder = MyViewHolder(binding)
        return holder
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val month = getItem(position)
        holder.bind(month, position)
        Log.e("MonthListAdapter", "onBindViewHolder $position")
    }
}

/*
class MonthListAdapter(val listener: MonthListAdapterListener) :
    ListAdapter<Month, MonthListAdapter.MonthItemViewHolder>(MonthDiffCallback()) {


    override fun onBindViewHolder(holder: MonthListAdapter.MonthItemViewHolder, position: Int) {
        holder.setData(getItem(position), position)
    }

    inner class MonthItemViewHolder(val binding: ListItemMonthsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun setData(month: Month, position: Int) {

            binding.name.text = month.name

            Glide.with(binding.root.context)
                .load(month.image)
                .centerCrop()
                .into(binding.imageMonth)

            binding.root.setOnClickListener {
                listener.onCardClicked(month, position)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MonthItemViewHolder {
        return MonthItemViewHolder(
            binding = ListItemMonthsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )

        )
    }
*/




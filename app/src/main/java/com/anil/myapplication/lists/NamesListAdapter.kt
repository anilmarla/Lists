package com.anil.myapplication.lists

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.anil.myapplication.databinding.ListItemNameBinding

class NamesListAdapter: ListAdapter<String, NamesListAdapter.NameViewHolder>(NameDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NameViewHolder {
        return NameViewHolder(
            binding = ListItemNameBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: NameViewHolder, position: Int) {
        holder.setData(getItem(position))
    }

    inner class NameViewHolder(val binding: ListItemNameBinding) : RecyclerView.ViewHolder(binding.root){
        fun setData(title: String){
            binding.name.text = title
        }
    }
}

class NameDiffCallback : DiffUtil.ItemCallback<String>(){
    override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
        return oldItem == newItem
    }

}
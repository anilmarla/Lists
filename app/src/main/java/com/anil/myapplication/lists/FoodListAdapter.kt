package com.anil.myapplication.lists

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.anil.myapplication.databinding.ListItemFoodBinding
import com.bumptech.glide.Glide

class FoodListAdapter(val listener:FoodListAdapterListener) : ListAdapter<Food, FoodListAdapter.FoodItemViewHolder>(FoodNameDiffCallback()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodItemViewHolder {
        return FoodItemViewHolder(
            binding = ListItemFoodBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: FoodItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    inner class FoodItemViewHolder(val binding: ListItemFoodBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(food: Food){
            binding.title.text = food.name

            // loading image
            Glide.with(binding.root.context)
                .load(food.image)
                .circleCrop()
                .into(binding.thumbnail)

            binding.root.setOnClickListener {
                listener.onItemClicked(food)
            }

            binding.thumbnail.setOnClickListener {
                listener.onImageClicked(food.image)
            }
        }
    }
}

interface FoodListAdapterListener{
    fun onItemClicked(food: Food)
    fun onImageClicked(imageUrl: String)
}

class FoodNameDiffCallback : DiffUtil.ItemCallback<Food>(){
    override fun areItemsTheSame(oldItem: Food, newItem: Food): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(oldItem: Food, newItem: Food): Boolean {
        return oldItem == newItem
    }
}
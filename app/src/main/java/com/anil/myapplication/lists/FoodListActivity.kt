package com.anil.myapplication.lists

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.anil.myapplication.R
import com.anil.myapplication.databinding.ActivityFoodListBinding

class FoodListActivity : AppCompatActivity(), FoodListAdapterListener {
    private lateinit var binding: ActivityFoodListBinding
    private lateinit var adapter: FoodListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFoodListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = FoodListAdapter(this)
        binding.recyclerview.adapter = adapter


        // submitting data
        val items = mutableListOf<Food>()

        for (i in 0..50){
            items.add(Food(name = "Biryani", image = "https://static.toiimg.com/photo/62445638.cms"))
            items.add(Food("Idli", "https://www.indianhealthyrecipes.com/wp-content/uploads/2022/04/idli-recipe.jpg"))
            items.add(Food("Puri", "https://www.vegrecipesofindia.com/wp-content/uploads/2020/11/puri-2.jpg"))
            items.add(Food("Dosa", "https://static.toiimg.com/photo/90401385.cms"))
        }

        adapter.submitList(items)


        // click listener
    }

    override fun onItemClicked(food: Food) {
        Toast.makeText(this, "Item clicked ${food.name}", Toast.LENGTH_SHORT).show()
    }

    override fun onImageClicked(imageUrl: String) {
        Toast.makeText(this, "Image clicked $imageUrl", Toast.LENGTH_SHORT).show()
    }
}
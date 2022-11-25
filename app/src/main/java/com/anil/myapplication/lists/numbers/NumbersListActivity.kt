package com.anil.myapplication.lists.numbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anil.myapplication.R
import com.anil.myapplication.databinding.ActivityFoodListBinding
import com.anil.myapplication.databinding.ActivityNumbersListBinding
import com.anil.myapplication.lists.NamesListAdapter

class NumbersListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNumbersListBinding
    private lateinit var adapter: NumberListAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNumbersListBinding.inflate(layoutInflater)

        setContentView(binding.root)

        adapter = NumberListAdapter()

        binding.recyclerview.adapter = adapter

        val numbers = mutableListOf<Int>()

        for (i in 1..100){
            numbers.add(i)
        }
        adapter.submitList(numbers)
    }
}



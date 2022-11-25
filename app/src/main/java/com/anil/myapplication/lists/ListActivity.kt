package com.anil.myapplication.lists

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.anil.myapplication.R
import com.anil.myapplication.databinding.ActivityListBinding

class ListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListBinding
    private lateinit var adapter: NamesListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = NamesListAdapter()

        // linking adapter to recyclerview
        binding.recyclerview.adapter = adapter

        // displaying list item
        val names = mutableListOf<String>()
        names.add("Anil")
        names.add("Ravi")
        names.add("Arun")
        names.add("Praveen")
        names.add("Anil")
        names.add("Ravi")
        names.add("Arun")
        names.add("Praveen")
        names.add("Anil")
        names.add("Ravi")
        names.add("Arun")
        names.add("Praveen")
        names.add("Anil")
        names.add("Ravi")
        names.add("Arun")
        names.add("Praveen")
        names.add("Anil")
        names.add("Ravi")
        names.add("Arun")
        names.add("Praveen")
        names.add("Anil")
        names.add("Ravi")
        names.add("Arun")
        names.add("Praveen")
        names.add("Anil")
        names.add("Ravi")
        names.add("Arun")
        names.add("Praveen")
        names.add("Anil")
        names.add("Ravi")
        names.add("Arun")
        names.add("Praveen")
        names.add("Anil")
        names.add("Ravi")
        names.add("Arun")
        names.add("Praveen")
        names.add("Anil")
        names.add("Ravi")
        names.add("Arun")
        names.add("Praveen")
        names.add("Anil")
        names.add("Ravi")
        names.add("Arun")
        names.add("Praveen")

        adapter.submitList(names)
    }
}
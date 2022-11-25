package com.anil.myapplication.lists.months

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.anil.myapplication.R
import com.anil.myapplication.databinding.ActivityMonthListBinding
import com.anil.myapplication.utils.MarginItemDecoration

class MonthListActivity : AppCompatActivity(), MonthListAdapterListener {
    private lateinit var binding: ActivityMonthListBinding
    private lateinit var adapter: MonthListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMonthListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        adapter = MonthListAdapter(this)

        binding.recyclerview.adapter = adapter

        // grid layout
        binding.recyclerview.layoutManager = GridLayoutManager(this, 2)

        // space b/w items
        binding.recyclerview.addItemDecoration(
            MarginItemDecoration(resources.getDimensionPixelSize(R.dimen.grid_margin), 2)
        )

        val months = mutableListOf<Month>()

        months.add(
            Month(
                "January",
                "https://cdn.pixabay.com/photo/2018/08/14/13/23/ocean-3605547__340.jpg",
            )
        )
        months.add(
            Month(
                "February",
                "https://cdn.pixabay.com/photo/2018/01/14/23/12/nature-3082832__340.jpg"
            )
        )
        months.add(
            Month(
                "March",
                "https://c4.wallpaperflare.com/wallpaper/500/442/354/outrun-vaporwave-hd-wallpaper-thumb.jpg"
            )
        )
        months.add(
            Month(
                "April",
                "https://plus.unsplash.com/premium_photo-1668136403317-1230640e4b9f?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8bmF0dXJlJTIwd2FsbHBhcGVyfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60"
            )
        )
        months.add(
            Month(
                "May",
                "https://images.unsplash.com/photo-1552083375-1447ce886485?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Mnx8bmF0dXJlJTIwd2FsbHBhcGVyfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60"
            )
        )
        months.add(
            Month(
                "June",
                "https://images.unsplash.com/photo-1552845108-5f775a2ccb9b?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8Nnx8bmF0dXJlJTIwd2FsbHBhcGVyfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60"
            )
        )
        months.add(
            Month(
                "July",
                "https://images.unsplash.com/photo-1501785888041-af3ef285b470?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OHx8bmF0dXJlJTIwd2FsbHBhcGVyfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60"
            )
        )
        months.add(
            Month(
                "August",
                "https://images.unsplash.com/photo-1581881067989-7e3eaf45f4f6?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8OXx8bmF0dXJlJTIwd2FsbHBhcGVyfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=500&q=60"
            )
        )
        months.add(
            Month(
                "September",
                "https://images.unsplash.com/photo-1614254631324-38204235dfa8?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTB8fG5hdHVyZSUyMHdhbGxwYXBlcnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60"
            )
        )
        months.add(
            Month(
                "October",
                "https://images.unsplash.com/photo-1544961371-516024f8e267?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTJ8fG5hdHVyZSUyMHdhbGxwYXBlcnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60"
            )
        )
        months.add(
            Month(
                "November",
                "https://images.unsplash.com/photo-1559711836-951d1eb1a043?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MTZ8fG5hdHVyZSUyMHdhbGxwYXBlcnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60"
            )
        )
        months.add(
            Month(
                "December",
                "https://images.unsplash.com/photo-1550639264-38c3059c4620?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MjB8fG5hdHVyZSUyMHdhbGxwYXBlcnxlbnwwfHwwfHw%3D&auto=format&fit=crop&w=500&q=60"
            )
        )

        adapter.submitList(months)
    }

    override fun onCardClicked(month: Month, position: Int) {
        Toast.makeText(this, "This month is ${month.name}, position: $position",Toast.LENGTH_SHORT).show()

//        val months = mutableListOf<Month>()
//
//        months.add(
//            Month(
//                "January",
//                "https://cdn.pixabay.com/photo/2018/08/14/13/23/ocean-3605547__340.jpg"
//            )
//        )
//        months.add(
//            Month(
//                "February",
//                "https://cdn.pixabay.com/photo/2018/01/14/23/12/nature-3082832__340.jpg"
//            )
//        )
//
//        adapter.submitList(months)
    }

    override fun onTitleClicked() {
        Toast.makeText(this, "On title clicked", Toast.LENGTH_SHORT).show()
    }
}
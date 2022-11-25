package com.anil.myapplication.lists.months

interface MonthListAdapterListener {
    fun onCardClicked(month: Month, position: Int)
    fun onTitleClicked()
}
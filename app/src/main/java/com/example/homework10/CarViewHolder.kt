package com.example.homework10

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_layout.view.*

class CarViewHolder(private val root: View) : RecyclerView.ViewHolder(root) {
    fun bind(food: CarsModel) {
        root.tvTitle.text = food.title
        root.tvDescription.text = food.description
        root.ivCar.setImageResource(food.imgId)
    }
}
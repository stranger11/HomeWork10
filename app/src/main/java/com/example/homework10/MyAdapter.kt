package com.example.homework10

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter : RecyclerView.Adapter<CarViewHolder>() {

    private var carList: MutableList<CarsModel> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CarViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)
        return CarViewHolder(
            layoutInflater
        )
    }

    override fun getItemCount(): Int {
        return carList.size
    }

    override fun onBindViewHolder(holder: CarViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    private fun getItem(position: Int): CarsModel {
        return carList[position]
    }

    fun addAll(genreList: List<CarsModel>) {
        this.carList.clear()
        this.carList.addAll(genreList)
        notifyDataSetChanged()
    }

}
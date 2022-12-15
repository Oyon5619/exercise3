package com.project.myhometown

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class FoodAdapter(val foods: List<Food>):
    RecyclerView.Adapter<FoodAdapter.FoodHolder>() {
    inner class FoodHolder(view: View): RecyclerView.ViewHolder(view) {
        val foodName: TextView = view.findViewById(R.id.food_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.food_item, parent, false)
        val foodHolder = FoodHolder(view)
        foodHolder.foodName.setOnClickListener{
            val food = foods[foodHolder.adapterPosition]
            Toast.makeText(parent.context, "${food.foodName}",
                Toast.LENGTH_SHORT).show()
        }
        return foodHolder
    }

    override fun onBindViewHolder(holder: FoodHolder, position: Int) {
        val food = foods[position]
        holder.foodName.text = food.foodName
    }

    override fun getItemCount() = foods.size
}
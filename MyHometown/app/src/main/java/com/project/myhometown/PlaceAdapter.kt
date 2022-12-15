package com.project.myhometown

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class PlaceAdapter(val places: List<Place>):
    RecyclerView.Adapter<PlaceAdapter.PlaceHolder>() {
        inner class PlaceHolder(view: View): RecyclerView.ViewHolder(view) {
            val placeTitle: TextView = view.findViewById(R.id.place_title)
            val placeContent: TextView = view.findViewById(R.id.place_content)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaceHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.place_item, parent, false)
        val placeHolder = PlaceHolder(view)

        placeHolder.placeTitle.setOnClickListener {
            val place = places[placeHolder.adapterPosition]
            Toast.makeText(parent.context, "${place.title}",
                Toast.LENGTH_LONG).show()
        }

        return placeHolder
    }

    override fun onBindViewHolder(holder: PlaceHolder, position: Int) {
        val place = places[position]
        holder.placeTitle.text = place.title
        holder.placeContent.text = place.content
    }

    override fun getItemCount() = places.size
}
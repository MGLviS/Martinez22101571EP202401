package com.example.martinez22101571ep202401.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.martinez22101571ep202401.Model.StadiumModel
import com.example.martinez22101571ep202401.R

class StadiumAdapter (private var lstStadium: List<StadiumModel>):
    RecyclerView.Adapter<StadiumAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivStadium: ImageView = itemView.findViewById(R.id.ivFoto)
        val tvStadiumName: TextView = itemView.findViewById(R.id.tvNombre)
        val tvStadiumUbicacion: TextView = itemView.findViewById(R.id.tvUbicacion)
        val tvStadiumCapacidad: TextView = itemView.findViewById(R.id.tvCapacidad)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item_stadiums, parent, false))
    }

    override fun getItemCount(): Int {
        return lstStadium.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val itemStadium = lstStadium[position]
        holder.ivStadium.setImageResource(itemStadium.image)
        holder.tvStadiumName.text = itemStadium.name
        holder.tvStadiumUbicacion.text = itemStadium.ubicacion
        holder.tvStadiumCapacidad.text = itemStadium.capacidad
    }
}



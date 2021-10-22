package com.delnortedevs.atm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.delnortedevs.atm.databinding.ItemMovimientosBinding

class Adapter (var todos: List<Movimientos>) : RecyclerView.Adapter<Adapter.ViewHolder>() {

    class ViewHolder (val binding: ItemMovimientosBinding) : RecyclerView.ViewHolder(binding.root)   {

    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ItemMovimientosBinding.inflate(layoutInflater,parent,false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {


    }

    override fun getItemCount(): Int {
     return 0
    }

}
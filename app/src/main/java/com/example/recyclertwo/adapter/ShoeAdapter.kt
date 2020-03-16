package com.example.recyclertwo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclertwo.R
import com.example.recyclertwo.model.Shoe
import kotlinx.android.synthetic.main.item_shoe.view.*

class ShoeAdapter(var shoeList: List<Shoe>): RecyclerView.Adapter<ShoeAdapter.ShoeViewHolder>() {
    inner class ShoeViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(shoe: Shoe) {
            itemView.txtShoeId.text = shoe.id.toString()
            itemView.imgShoe.setImageResource(shoe.image)
            itemView.txtDescription.text = shoe.description
            itemView.txtCost.text = shoe.fee.toString()
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_shoe, parent, false)
        return ShoeViewHolder(view)
    }

    override fun getItemCount(): Int = shoeList.size

    override fun onBindViewHolder(holder: ShoeViewHolder, position: Int) {
        holder.bind(shoeList[position])
    }
}
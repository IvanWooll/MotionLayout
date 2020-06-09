package com.ivanwooll.motionlayout

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item.view.*

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.VH>() {

    private val items =
        arrayListOf("one", "two", "three", "four", "five")

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false))
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.itemView.textView.text = items[holder.adapterPosition]
    }

    class VH(itemView: View) : RecyclerView.ViewHolder(itemView)
}
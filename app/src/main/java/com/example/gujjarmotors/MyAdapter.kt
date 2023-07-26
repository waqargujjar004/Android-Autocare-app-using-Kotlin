package com.example.gujjarmotors

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder

class MyAdapter(val songs: List<song>) : Adapter<MyAdapter.MyViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_view,parent,false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
       holder.txtTitle.text = songs[position].title
        holder.txtDescription.text = songs[position].description
        holder.images.setImageResource(songs[position].image)
    }

    override fun getItemCount(): Int {
        return songs.size
    }

    class MyViewHolder(itemView: View) : ViewHolder(itemView)
    {
        var txtTitle = itemView.findViewById<TextView>(R.id.headline_text_view)
        var txtDescription = itemView.findViewById<TextView>(R.id.description_text_view)
        var images = itemView.findViewById<ImageView>(R.id.modicon)
    }
}



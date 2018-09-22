package com.example.riza.footballapp

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.riza.footballapp.layout.ClubItem
import org.jetbrains.anko.AnkoContext

/**
 * Created by riza on 05/09/18.
 */
class ClubAdapter(private val items: MutableList<Club>, private val listener: (Club) -> Unit)
    : RecyclerView.Adapter<ClubAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
            ViewHolder(ClubItem().createView(AnkoContext.create(parent.context)))

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(items[position], listener)
    }

    override fun getItemCount(): Int = items.size

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        //        no xml need findByID
        private val name = itemView.findViewById<TextView>(R.id.name)
        private val image = itemView.findViewById<ImageView>(R.id.image)

        fun bindItem(items: Club, listener: (Club) -> Unit) {
            name.text = items.name
            Glide.with(itemView.context).load(items.img).into(image)

            itemView.setOnClickListener {
                listener(items)
            }
        }
    }
}
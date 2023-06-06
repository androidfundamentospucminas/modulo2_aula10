package com.walker.modulo2aula10androidfundamentos

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewPager2Adapter(
    private val context: Context,
    private val itemList: List<String>
) : RecyclerView.Adapter<ViewPager2Adapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewPager2Adapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.page_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = itemList[position]
        holder.bind(item)
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        private val titleTextView: TextView = itemView.findViewById(R.id.textTitle)

        fun bind(item: String) {
            titleTextView.text = item
        }
    }

}

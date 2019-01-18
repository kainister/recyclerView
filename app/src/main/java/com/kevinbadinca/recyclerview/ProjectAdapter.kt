package com.kevinbadinca.recyclerview

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.project_row.view.*

class ProjectAdapter(private val project: MutableList<Project>) : RecyclerView.Adapter<ProjectAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.project_row, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return project.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = project[position].title
        holder.description.text = project[position].description
        holder.tech.text = project[position].tech
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.title
        val description: TextView = itemView.description
        val tech: TextView = itemView.tech
    }

}

/*
 * Copyright (c) 2019. Pisey Sen.
 * @Created by piseysen on 6/12/19 2:17 PM
 */

package com.pisey.kotlinrecyclerviewlikeplaystore.ui.component.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pisey.kotlinrecyclerviewlikeplaystore.R
import com.pisey.kotlinrecyclerviewlikeplaystore.data.model.CountryModel
import kotlinx.android.synthetic.main.item_country.view.*

class CountryAdapter(private val context: Context, private var countryList: ArrayList<CountryModel>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    init {
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_country, parent, false))
    }

    override fun getItemCount(): Int {
        return countryList.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = countryList[position]
        holder.itemView.tv_country_name.text = item.name
        holder.itemView.tv_region.text = item.region
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }
}


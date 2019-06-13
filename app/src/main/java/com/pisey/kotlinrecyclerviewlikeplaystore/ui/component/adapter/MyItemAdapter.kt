/*
 * @Created by piseysen on 5/23/19 12:30 PM
 */

package com.pisey.kotlinrecyclerviewlikeplaystore.ui.component.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pisey.kotlinrecyclerviewlikeplaystore.R
import com.pisey.kotlinrecyclerviewlikeplaystore.data.model.ListItem
import com.pisey.kotlinrecyclerviewlikeplaystore.util.GlideApp
import kotlinx.android.synthetic.main.layout_item.view.*


class MyItemAdapter(private val context: Context, private val itemDataList: List<ListItem>?) :
    RecyclerView.Adapter<MyItemAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, position: Int): MyViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.layout_item, viewGroup, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(myViewHolder: MyViewHolder, position: Int) {
        val itemData = itemDataList?.get(position) ?: return
        myViewHolder.itemView.tvTitle.text = itemData.name
        GlideApp.with(context)
            .load(itemData.image)
            .into( myViewHolder.itemView.itemImage)
    }

    override fun getItemCount(): Int {
        return itemDataList?.size ?: 0
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView), View.OnClickListener {
        override fun onClick(v: View?) {

        }
    }
}

/*
 * @Created by piseysen on 5/23/19 12:17 PM
 */

package com.pisey.kotlinrecyclerviewlikeplaystore.ui.component.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pisey.kotlinrecyclerviewlikeplaystore.R
import com.pisey.kotlinrecyclerviewlikeplaystore.data.model.MyData
import kotlinx.android.synthetic.main.layout_group.view.*

class MyItemGroupAdapter(private val context: Context, private val dataList: List<MyData>?) :
    RecyclerView.Adapter<MyItemGroupAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): MyViewHolder {
        val itemView = LayoutInflater.from(context).inflate(R.layout.layout_group, viewGroup, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(myViewHolder: MyViewHolder, i: Int) {
        myViewHolder.itemTitle.text = dataList?.get(i)?.headerTitle ?: ""
        val itemData = dataList?.get(i)?.listItem
        val itemListAdapter = MyItemAdapter(context, itemData)
        myViewHolder.recyclerItemList.setHasFixedSize(true)
        myViewHolder.recyclerItemList.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        myViewHolder.recyclerItemList.adapter = itemListAdapter

        myViewHolder.recyclerItemList.isNestedScrollingEnabled = false //Important
        //Button more
        myViewHolder.btnMore.setOnClickListener {

        }


    }

    override fun getItemCount(): Int {
        return dataList?.size ?: 0
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var itemTitle: AppCompatTextView = itemView.itemTitle
        var recyclerItemList: RecyclerView = itemView.recycler_view_list
        var btnMore: AppCompatButton = itemView.btnMore

    }
}

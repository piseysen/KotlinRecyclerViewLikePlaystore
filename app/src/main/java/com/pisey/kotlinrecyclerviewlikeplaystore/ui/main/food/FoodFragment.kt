/*
 * Copyright (c) 2019. Pisey Sen.
 * @Created by piseysen on 6/13/19 2:17 PM
 */

package com.pisey.kotlinrecyclerviewlikeplaystore.ui.main.food

import android.content.Context
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.google.firebase.database.GenericTypeIndicator
import com.pisey.kotlinrecyclerviewlikeplaystore.R
import com.pisey.kotlinrecyclerviewlikeplaystore.data.model.ListItem
import com.pisey.kotlinrecyclerviewlikeplaystore.data.model.MyData
import com.pisey.kotlinrecyclerviewlikeplaystore.ui.component.adapter.MyItemGroupAdapter
import com.pisey.kotlinrecyclerviewlikeplaystore.ui.component.callback.IFirebaseLoadListener
import com.pisey.kotlinrecyclerviewlikeplaystore.ui.component.fragment.BaseFragment
import com.pisey.kotlinrecyclerviewlikeplaystore.util.Constant
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.dashboard_fragment.*
import javax.inject.Inject

class FoodFragment : BaseFragment(), IFirebaseLoadListener {

    private var iFirebaseLoadListener: IFirebaseLoadListener? = null

    override fun getLayoutId() = R.layout.dashboard_fragment


    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel: FoodViewModel by lazy {
        ViewModelProviders.of(this, viewModelFactory).get(FoodViewModel::class.java)
    }

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        iFirebaseLoadListener = this
        observeData()
        viewModel.getListAllProduct()
    }

    private fun observeData() {
        viewModel.liveListProduct.observe(this, Observer {
            if (it.isSuccess) {
                val result = it.getOrNull()
                if (result != null) {
                    val itemGroups = ArrayList<MyData>()
                    result.children.forEach { groupSnapShot ->
                        val itemGroup = MyData()
                        val header = groupSnapShot.child(Constant.Key.HEADER_TITLE).getValue(true).toString()
                        itemGroup.headerTitle = header
                        val genericTypeIndicator = object : GenericTypeIndicator<java.util.ArrayList<ListItem>>() {}
                        itemGroup.listItem = groupSnapShot.child(Constant.Key.LIST_ITEM).getValue(genericTypeIndicator)
                        itemGroups.add(itemGroup)
                    }
                    iFirebaseLoadListener?.onFirebaseLoadSuccess(itemGroups)

                }
            }
        })
    }

    override fun onFirebaseLoadSuccess(itemGroupList: MutableList<MyData>) {
        val adapter = MyItemGroupAdapter(requireContext(), itemGroupList)
        recycler_list_product?.post {
            recycler_list_product?.adapter = adapter
        }
    }

    override fun onFirebaseLoadFailed(message: String) {

    }

}

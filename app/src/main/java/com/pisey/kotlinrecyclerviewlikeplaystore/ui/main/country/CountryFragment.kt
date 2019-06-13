/*
 * Copyright (c) 2019. Pisey Sen.
 * @Created by piseysen on 6/12/19 2:17 PM
 */

package com.pisey.kotlinrecyclerviewlikeplaystore.ui.main.country

import android.content.Context
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.pisey.kotlinrecyclerviewlikeplaystore.R
import com.pisey.kotlinrecyclerviewlikeplaystore.data.model.CountryModel
import com.pisey.kotlinrecyclerviewlikeplaystore.ui.component.adapter.CountryAdapter
import com.pisey.kotlinrecyclerviewlikeplaystore.ui.component.fragment.BaseFragment
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.home_fragment.*
import javax.inject.Inject

class CountryFragment : BaseFragment() {

    private var mCountryAdapter: CountryAdapter? = null

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel: CountryViewModel by lazy {
        ViewModelProviders.of(this, viewModelFactory).get(CountryViewModel::class.java)
    }

    override fun getLayoutId() = R.layout.home_fragment

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel.countryLiveData.observe(this, Observer {
            if (it.isSuccess) {
                val result = it.getOrNull()
                val items = ArrayList<CountryModel>()
                result?.forEach { country ->
                    items.add(country)
                }
                mCountryAdapter = CountryAdapter(requireContext(), items)
                recycler_view.adapter = mCountryAdapter
                recycler_view.adapter?.notifyDataSetChanged()
            }
        })
        viewModel.getAllCountryList()
    }

}

package com.pisey.kotlinrecyclerviewlikeplaystore.ui.main.home

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.pisey.kotlinrecyclerviewlikeplaystore.R
import com.pisey.kotlinrecyclerviewlikeplaystore.data.model.CountryModel
import com.pisey.kotlinrecyclerviewlikeplaystore.ui.component.adapter.CountryAdapter
import dagger.android.support.AndroidSupportInjection
import kotlinx.android.synthetic.main.home_fragment.*
import javax.inject.Inject

class HomeFragment : Fragment() {

    private var mCountryAdapter: CountryAdapter? = null

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel: HomeViewModel by lazy {
        ViewModelProviders.of(this, viewModelFactory).get(HomeViewModel::class.java)
    }

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.home_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        recycler_view?.apply {
            adapter = mCountryAdapter
        }

        viewModel.countryLiveData.observe(this, Observer {
            if (it.isSuccess) {
                val result = it.getOrNull()
                println("items" + result?.size ?: 0)
                val items=ArrayList<CountryModel>()
                result?.forEach { country ->
                  items.add(country)
                }
                mCountryAdapter = CountryAdapter(requireContext(),items)
                recycler_view.adapter=mCountryAdapter
                recycler_view.adapter?.notifyDataSetChanged()
            }
        })
        viewModel.getAllCountryList()
    }

}

package com.pisey.kotlinrecyclerviewlikeplaystore.ui.main.about

import android.content.Context
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.pisey.kotlinrecyclerviewlikeplaystore.R
import com.pisey.kotlinrecyclerviewlikeplaystore.ui.component.fragment.BaseFragment
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class AboutFragment : BaseFragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    private val viewModel : AboutViewModel by lazy {
        ViewModelProviders.of(this,viewModelFactory).get(AboutViewModel::class.java)
    }

    override fun getLayoutId() = R.layout.about_fragment

    override fun onAttach(context: Context?) {
        AndroidSupportInjection.inject(this)
        super.onAttach(context)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
    }

}

package com.pisey.kotlinrecyclerviewlikeplaystore.ui.component.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {
    abstract fun getLayoutId(): Int
    protected var root: View? = null
    final override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        if (getLayoutId() == 0) {
            throw RuntimeException("Invalid Layout ID")
        }

        if (root == null)
            root = container?.inflate(getLayoutId())
        return root
    }

    fun ViewGroup.inflate(layoutId: Int, attachToRoot: Boolean = false): View {
        return LayoutInflater.from(context).inflate(layoutId, this, attachToRoot)
    }
}
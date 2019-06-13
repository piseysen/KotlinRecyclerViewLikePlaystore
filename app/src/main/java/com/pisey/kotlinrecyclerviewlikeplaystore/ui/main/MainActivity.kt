/*
 * @Created by piseysen on 6/10/19 2:47 PM
 */

package com.pisey.kotlinrecyclerviewlikeplaystore.ui.main

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.pisey.kotlinrecyclerviewlikeplaystore.R
import com.pisey.kotlinrecyclerviewlikeplaystore.ui.component.activity.BaseActivity
import com.pisey.kotlinrecyclerviewlikeplaystore.ui.main.country.CountryFragment
import com.pisey.kotlinrecyclerviewlikeplaystore.ui.main.food.FoodFragment
import com.pisey.kotlinrecyclerviewlikeplaystore.util.Constant
import com.pisey.kotlinrecyclerviewlikeplaystore.util.ext.replaceFragment
import com.pisey.kotlinrecyclerviewlikeplaystore.util.ext.setFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        setFragment(layout_content.id, ::FoodFragment)
        setMenuTitle(Constant.NavigateType.FOOD)
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_food -> {
                replaceFragment(
                    layout_content.id, ::FoodFragment
                )
                setMenuTitle(Constant.NavigateType.FOOD)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_country -> {

                replaceFragment(layout_content.id, ::CountryFragment)
                setMenuTitle(Constant.NavigateType.COUNTRY)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_me -> {
                setMenuTitle(Constant.NavigateType.ABOUT)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    private fun setMenuTitle(type: Int) {
        when (type) {
            Constant.NavigateType.FOOD -> toolbar.title = getString(R.string.title_food)
            Constant.NavigateType.COUNTRY -> toolbar.title = getString(R.string.title_country)
            else -> toolbar.title = getString(R.string.title_me)
        }
    }

}


/*
 * @Created by piseysen on 6/10/19 2:47 PM
 */

package com.pisey.kotlinrecyclerviewlikeplaystore.ui.main

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.pisey.kotlinrecyclerviewlikeplaystore.R
import com.pisey.kotlinrecyclerviewlikeplaystore.ui.main.home.HomeFragment
import com.pisey.kotlinrecyclerviewlikeplaystore.util.ext.replaceFragment
import com.pisey.kotlinrecyclerviewlikeplaystore.util.ext.setFragment
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : DaggerAppCompatActivity() {

    private val onNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                replaceFragment(layout_content.id,::HomeFragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_dashboard -> {

                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_notifications -> {
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        setFragment(layout_content.id,::HomeFragment)
        navView.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener)
    }

}

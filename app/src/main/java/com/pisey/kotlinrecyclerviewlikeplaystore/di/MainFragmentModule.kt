/*
 * Copyright (c) 2019. Pisey Sen.
 * @Created by piseysen on 6/12/19 2:17 PM
 */

package com.pisey.kotlinrecyclerviewlikeplaystore.di

import com.pisey.kotlinrecyclerviewlikeplaystore.ui.main.about.AboutFragment
import com.pisey.kotlinrecyclerviewlikeplaystore.ui.main.country.CountryFragment
import com.pisey.kotlinrecyclerviewlikeplaystore.ui.main.food.FoodFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class MainFragmentModule {
    @ContributesAndroidInjector
    internal abstract fun contributeHomeFragmentInjector(): CountryFragment

    @ContributesAndroidInjector
    internal abstract fun contributeDashboardFragmentInjector(): FoodFragment

    @ContributesAndroidInjector
    internal abstract fun contributeAboutFragmentInjector():AboutFragment
}
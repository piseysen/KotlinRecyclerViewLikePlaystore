package com.pisey.kotlinrecyclerviewlikeplaystore.di

import com.pisey.kotlinrecyclerviewlikeplaystore.ui.main.home.HomeFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class MainFragmentModule {
    @ContributesAndroidInjector
    internal abstract fun contributeHomeFragmentInjector(): HomeFragment
}
package com.pisey.kotlinrecyclerviewlikeplaystore.di

import com.pisey.kotlinrecyclerviewlikeplaystore.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
internal abstract class ActivityBuilder {

    @ContributesAndroidInjector
    internal abstract fun contributeMainActivityInjector(): MainActivity
}
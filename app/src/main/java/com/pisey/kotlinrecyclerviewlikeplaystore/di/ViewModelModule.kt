/*
 * Copyright (c) 2019. Pisey Sen.
 * @Created by piseysen on 6/12/19 2:17 PM
 */

package com.pisey.kotlinrecyclerviewlikeplaystore.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.pisey.kotlinrecyclerviewlikeplaystore.ui.main.food.FoodViewModel
import com.pisey.kotlinrecyclerviewlikeplaystore.ui.main.country.CountryViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module(includes = [RepositoryModule::class])
interface ViewModelModule {
    @Binds
    fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(CountryViewModel::class)
    fun bindHomeViewModel(viewModel: CountryViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(FoodViewModel::class)
    fun bindDashboardViewModel(viewModel: FoodViewModel):ViewModel
}
package com.pisey.kotlinrecyclerviewlikeplaystore.di

import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module

@Module(includes = [RepositoryModule::class])
interface ViewModelModule {
    @Binds
    fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}
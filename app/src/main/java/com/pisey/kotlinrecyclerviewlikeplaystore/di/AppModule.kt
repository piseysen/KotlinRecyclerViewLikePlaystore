package com.pisey.kotlinrecyclerviewlikeplaystore.di

import dagger.Module


@Module(includes = [DatabaseModule::class,ViewModelModule::class])
internal object AppModule {
}
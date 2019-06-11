package com.pisey.kotlinrecyclerviewlikeplaystore.di

import dagger.Module


@Module(includes = [DatabaseModule::class, ViewModelModule::class, FirebaseModule::class, NetworkModule::class])
internal object AppModule {
}
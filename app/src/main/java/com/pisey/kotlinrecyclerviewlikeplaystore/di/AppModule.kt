/*
 * Copyright (c) 2019. Pisey Sen.
 * @Created by piseysen on 6/12/19 2:17 PM
 */

package com.pisey.kotlinrecyclerviewlikeplaystore.di

import dagger.Module


@Module(includes = [DatabaseModule::class, ViewModelModule::class, FirebaseModule::class, NetworkModule::class])
internal object AppModule {
}
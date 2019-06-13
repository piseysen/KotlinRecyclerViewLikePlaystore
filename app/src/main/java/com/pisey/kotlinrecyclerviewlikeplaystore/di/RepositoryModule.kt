/*
 * Copyright (c) 2019. Pisey Sen.
 * @Created by piseysen on 6/12/19 2:17 PM
 */

package com.pisey.kotlinrecyclerviewlikeplaystore.di

import com.pisey.kotlinrecyclerviewlikeplaystore.data.repository.DeviceRepository
import com.pisey.kotlinrecyclerviewlikeplaystore.data.repository.IDevice
import dagger.Binds
import dagger.Module

@Module
interface RepositoryModule {

    @Binds
    fun bindDeviceRepository(repository: DeviceRepository):IDevice

}
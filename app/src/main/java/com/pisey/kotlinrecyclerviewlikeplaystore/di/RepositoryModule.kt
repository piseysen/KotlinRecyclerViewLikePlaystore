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
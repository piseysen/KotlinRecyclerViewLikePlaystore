package com.pisey.kotlinrecyclerviewlikeplaystore.data.repository

import com.pisey.kotlinrecyclerviewlikeplaystore.data.local.Entity.DeviceEntity
import io.reactivex.Completable
import io.reactivex.Single

interface IDevice {
    fun save(device:DeviceEntity):Completable
    fun get():Single<DeviceEntity>
}
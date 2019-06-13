/*
 * Copyright (c) 2019. Pisey Sen.
 * @Created by piseysen on 6/12/19 2:17 PM
 */

package com.pisey.kotlinrecyclerviewlikeplaystore.data.repository

import com.pisey.kotlinrecyclerviewlikeplaystore.data.local.Entity.DeviceEntity
import io.reactivex.Completable
import io.reactivex.Single

interface IDeviceRepository {
    fun save(device:DeviceEntity):Completable
    fun get():Single<DeviceEntity>
}
/*
 * Copyright (c) 2019. Pisey Sen.
 * @Created by piseysen on 6/12/19 2:17 PM
 */

package com.pisey.kotlinrecyclerviewlikeplaystore.data.repository

import com.pisey.kotlinrecyclerviewlikeplaystore.data.local.Entity.DeviceEntity
import com.pisey.kotlinrecyclerviewlikeplaystore.data.local.dao.DeviceDao
import com.pisey.kotlinrecyclerviewlikeplaystore.data.local.room.AppDatabase
import io.reactivex.Completable
import io.reactivex.Single
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DeviceRepository @Inject constructor(
    private val database: AppDatabase,
    private val dao: DeviceDao
) : IDevice {
    override fun save(device: DeviceEntity): Completable {
        return Completable.create {
            database.runInTransaction {
                dao.save(device)
            }
            it.onComplete()
        }
    }

    override fun get(): Single<DeviceEntity> {
        return dao.get()
    }
}
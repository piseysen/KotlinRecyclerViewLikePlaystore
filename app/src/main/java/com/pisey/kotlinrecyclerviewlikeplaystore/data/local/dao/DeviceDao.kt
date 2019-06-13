/*
 * Copyright (c) 2019. Pisey Sen.
 * @Created by piseysen on 6/12/19 2:17 PM
 */

package com.pisey.kotlinrecyclerviewlikeplaystore.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.pisey.kotlinrecyclerviewlikeplaystore.data.local.Entity.DeviceEntity
import io.reactivex.Single

@Dao
interface DeviceDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun save(device: DeviceEntity):Long

    @Query("SELECT * FROM device")
    fun get():Single<DeviceEntity>

}
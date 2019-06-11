package com.pisey.kotlinrecyclerviewlikeplaystore.data.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.pisey.kotlinrecyclerviewlikeplaystore.data.local.Entity.DeviceEntity
import com.pisey.kotlinrecyclerviewlikeplaystore.data.local.dao.DeviceDao

@Database(
    entities = [DeviceEntity::class],
    version = 1,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase(){
   abstract val deviceDao: DeviceDao
}
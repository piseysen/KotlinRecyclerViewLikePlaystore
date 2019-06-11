package com.pisey.kotlinrecyclerviewlikeplaystore.di

import androidx.room.Room
import com.pisey.kotlinrecyclerviewlikeplaystore.MyApp
import com.pisey.kotlinrecyclerviewlikeplaystore.data.local.dao.DeviceDao
import com.pisey.kotlinrecyclerviewlikeplaystore.data.local.room.AppDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(app:MyApp): AppDatabase{
        return Room.databaseBuilder(app,AppDatabase::class.java,"test.db")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun provideDeviceDao(db:AppDatabase):DeviceDao=db.deviceDao

}
package com.pisey.kotlinrecyclerviewlikeplaystore

import android.content.Context
import com.pisey.kotlinrecyclerviewlikeplaystore.di.DaggerAppComponent
import com.pisey.kotlinrecyclerviewlikeplaystore.di.DatabaseModule
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

open class MyApp : DaggerApplication(){
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> =androidInjector

    lateinit var androidInjector: AndroidInjector<out DaggerApplication>

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
       androidInjector= DaggerAppComponent.builder()
           .application(this)
           .database(DatabaseModule())
           .build()

    }

    override fun onCreate() {
        super.onCreate()
    }

    companion object{
        private lateinit var instance:MyApp
        fun init():MyApp{
            return instance
        }
    }
}

val myApp=MyApp.init()
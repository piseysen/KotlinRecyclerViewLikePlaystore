package com.pisey.kotlinrecyclerviewlikeplaystore.di

import com.bumptech.glide.module.AppGlideModule
import com.pisey.kotlinrecyclerviewlikeplaystore.MyApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
    AndroidSupportInjectionModule::class,
    ActivityBuilder::class,
    AppModule::class
    ]
)

interface AppComponent :AndroidInjector<MyApp>{

    @Component.Builder
    interface Builder{

        @BindsInstance
        fun application(application :MyApp):Builder

        fun database(database: DatabaseModule): Builder

        fun build():AppComponent
    }

    override fun inject(instance: MyApp)

    fun inject(glideModule: AppGlideModule)
}
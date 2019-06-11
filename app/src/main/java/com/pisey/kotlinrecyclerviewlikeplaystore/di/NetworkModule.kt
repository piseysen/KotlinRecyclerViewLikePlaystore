package com.pisey.kotlinrecyclerviewlikeplaystore.di

import com.pisey.kotlinrecyclerviewlikeplaystore.util.Constant.COUNTRY_SERVICE_BASE_URL
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
open class NetworkModule {
   //https://medium.com/@aaraashkhan/using-dagger2-and-retrofit-4b162d0a2021
    @Provides
    @Singleton
    fun provideRetrofit(): Retrofit {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(COUNTRY_SERVICE_BASE_URL)
            .build()
    }

}
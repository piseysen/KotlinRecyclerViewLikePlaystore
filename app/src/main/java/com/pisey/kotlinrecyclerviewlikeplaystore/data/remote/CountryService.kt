package com.pisey.kotlinrecyclerviewlikeplaystore.data.remote

import com.pisey.kotlinrecyclerviewlikeplaystore.data.model.CountryModel
import io.reactivex.Flowable
import retrofit2.http.GET



interface CountryService {
    @GET("all")
    fun countryList(): Flowable<List<CountryModel>>
}
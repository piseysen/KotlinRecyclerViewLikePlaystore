/*
 * Copyright (c) 2019. Pisey Sen.
 * @Created by piseysen on 6/12/19 2:17 PM
 */

package com.pisey.kotlinrecyclerviewlikeplaystore.data.remote

import com.pisey.kotlinrecyclerviewlikeplaystore.data.model.CountryModel
import io.reactivex.Flowable
import retrofit2.http.GET



interface CountryService {
    @GET("all")
    fun countryList(): Flowable<List<CountryModel>>
}
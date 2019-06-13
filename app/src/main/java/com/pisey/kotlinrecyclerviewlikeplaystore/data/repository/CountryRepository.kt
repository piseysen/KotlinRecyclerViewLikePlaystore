/*
 * Copyright (c) 2019. Pisey Sen.
 * @Created by piseysen on 6/12/19 2:17 PM
 */

package com.pisey.kotlinrecyclerviewlikeplaystore.data.repository

import com.pisey.kotlinrecyclerviewlikeplaystore.data.model.CountryModel
import com.pisey.kotlinrecyclerviewlikeplaystore.data.remote.CountryService
import io.reactivex.Flowable
import javax.inject.Inject

class CountryRepository @Inject constructor(private val countryService: CountryService) : ICountryRepository {
    override fun getCountry(): Flowable<List<CountryModel>> {
        return countryService.countryList()
    }
}
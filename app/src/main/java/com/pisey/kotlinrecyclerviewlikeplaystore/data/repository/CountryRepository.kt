package com.pisey.kotlinrecyclerviewlikeplaystore.data.repository

import com.pisey.kotlinrecyclerviewlikeplaystore.data.model.CountryModel
import com.pisey.kotlinrecyclerviewlikeplaystore.data.remote.CountryService
import io.reactivex.Flowable
import javax.inject.Inject

class CountryRepository @Inject constructor(private val countryService: CountryService) : ICountry {
    override fun getCountry(): Flowable<List<CountryModel>> {
        return countryService.countryList()
    }
}
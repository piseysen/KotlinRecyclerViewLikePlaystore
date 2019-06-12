package com.pisey.kotlinrecyclerviewlikeplaystore.data.repository

import com.pisey.kotlinrecyclerviewlikeplaystore.data.model.CountryModel
import io.reactivex.Flowable

interface ICountry {
    fun getCountry(): Flowable<List<CountryModel>>
}
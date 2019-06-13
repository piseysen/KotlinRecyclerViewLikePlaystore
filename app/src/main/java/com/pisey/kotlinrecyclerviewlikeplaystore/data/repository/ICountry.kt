/*
 * Copyright (c) 2019. Pisey Sen.
 * @Created by piseysen on 6/12/19 2:17 PM
 */

package com.pisey.kotlinrecyclerviewlikeplaystore.data.repository

import com.pisey.kotlinrecyclerviewlikeplaystore.data.model.CountryModel
import io.reactivex.Flowable

interface ICountry {
    fun getCountry(): Flowable<List<CountryModel>>
}
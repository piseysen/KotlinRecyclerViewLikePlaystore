/*
 * Copyright (c) 2019. Pisey Sen.
 * @Created by piseysen on 6/12/19 2:17 PM
 */

package com.pisey.kotlinrecyclerviewlikeplaystore.ui.main.country

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.pisey.kotlinrecyclerviewlikeplaystore.data.model.CountryModel
import com.pisey.kotlinrecyclerviewlikeplaystore.data.repository.ICountryRepository
import com.pisey.kotlinrecyclerviewlikeplaystore.ui.component.BaseViewModel
import com.pisey.kotlinrecyclerviewlikeplaystore.util.defaultErrorHandler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.addTo
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class CountryViewModel @Inject constructor(private val rep: ICountryRepository) : BaseViewModel() {

    private val postCountry = MutableLiveData<Result<List<CountryModel>>>()
    val countryLiveData: LiveData<Result<List<CountryModel>>> = postCountry

    fun getAllCountryList() {
        rep.getCountry()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .map {
                Result.success(it)
            }
            .doOnError(defaultErrorHandler())
            .onErrorReturn {
                Result.failure(it)
            }
            .subscribeBy {
                postCountry.postValue(it)
            }
            .addTo(compositeDisposable)

    }


}

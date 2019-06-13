package com.pisey.kotlinrecyclerviewlikeplaystore.ui.main.food

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.google.firebase.database.DataSnapshot
import com.pisey.kotlinrecyclerviewlikeplaystore.data.repository.IProductRepository
import com.pisey.kotlinrecyclerviewlikeplaystore.ui.component.BaseViewModel
import com.pisey.kotlinrecyclerviewlikeplaystore.util.defaultErrorHandler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.rxkotlin.addTo
import io.reactivex.rxkotlin.subscribeBy
import io.reactivex.schedulers.Schedulers
import javax.inject.Inject

class FoodViewModel @Inject constructor(private val repo: IProductRepository) : BaseViewModel() {

    private val postListProduct = MutableLiveData<Result<DataSnapshot>>()
    val liveListProduct: LiveData<Result<DataSnapshot>> = postListProduct

    fun getListAllProduct() {
        repo.getProductList()
            .observeOn(Schedulers.io())
            .subscribeOn(AndroidSchedulers.mainThread())
            .map {
                Result.success(it)
            }
            .doOnError(defaultErrorHandler())
            .onErrorReturn {
                Result.failure(it)
            }
            .subscribeBy {
                postListProduct.postValue(it)
            }
            .addTo(compositeDisposable)
    }

}

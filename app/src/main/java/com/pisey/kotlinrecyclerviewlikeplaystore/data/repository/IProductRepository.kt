package com.pisey.kotlinrecyclerviewlikeplaystore.data.repository

import com.google.firebase.database.DataSnapshot
import io.reactivex.Maybe

interface IProductRepository {
    fun getProductList(): Maybe<DataSnapshot>
}
package com.pisey.kotlinrecyclerviewlikeplaystore.data.repository

import com.google.firebase.database.DataSnapshot
import io.reactivex.Maybe

interface IFoodRepository {
    fun getProductList(): Maybe<DataSnapshot>
}
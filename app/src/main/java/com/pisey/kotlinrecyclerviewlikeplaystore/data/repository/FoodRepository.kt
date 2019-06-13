package com.pisey.kotlinrecyclerviewlikeplaystore.data.repository

import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.FirebaseDatabase
import com.pisey.kotlinrecyclerviewlikeplaystore.util.Constant
import durdinapps.rxfirebase2.RxFirebaseDatabase
import io.reactivex.Maybe
import javax.inject.Inject

class FoodRepository @Inject constructor(private val firebaseDb: FirebaseDatabase) : IFoodRepository {
    override fun getProductList(): Maybe<DataSnapshot> {
        return RxFirebaseDatabase.observeSingleValueEvent(firebaseDb.getReference(Constant.Key.MY_DATA))
    }

}
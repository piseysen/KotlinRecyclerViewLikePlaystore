package com.pisey.kotlinrecyclerviewlikeplaystore.data.repository

import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.FirebaseDatabase
import durdinapps.rxfirebase2.RxFirebaseDatabase
import io.reactivex.Maybe
import javax.inject.Inject

class ProductRepository @Inject constructor(private val firebaseDb: FirebaseDatabase) : IProductRepository {
    override fun getProductList(): Maybe<DataSnapshot> {
        return RxFirebaseDatabase.observeSingleValueEvent(firebaseDb.getReference("MyData"))
    }


}
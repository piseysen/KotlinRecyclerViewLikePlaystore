package com.pisey.kotlinrecyclerviewlikeplaystore.di

import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.FirebaseFirestore
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class FirebaseModule {

    @Provides
    @Singleton
    fun provideFirestore(): FirebaseFirestore=FirebaseFirestore.getInstance()

    @Provides
    @Singleton
    fun provideFirebaseDb():FirebaseDatabase= FirebaseDatabase.getInstance()

}
/*
 * Copyright (c) 2019. Pisey Sen.
 * @Created by piseysen on 6/12/19 2:17 PM
 */

package com.pisey.kotlinrecyclerviewlikeplaystore.util.ext

import androidx.lifecycle.LiveData
import androidx.lifecycle.LiveDataReactiveStreams
import io.reactivex.BackpressureStrategy
import io.reactivex.Observable
import org.reactivestreams.Publisher

fun <T> Publisher<T>.toLiveData() = LiveDataReactiveStreams.fromPublisher(this) as LiveData<T>

fun <T : Any?> Observable<T>.toLiveData(strategy: BackpressureStrategy = BackpressureStrategy.LATEST) = toFlowable(strategy).toLiveData()
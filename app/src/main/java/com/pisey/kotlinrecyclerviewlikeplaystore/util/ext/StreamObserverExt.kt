package com.pisey.kotlinrecyclerviewlikeplaystore.util.ext

import io.grpc.stub.StreamObserver
import io.reactivex.Observable

inline fun <T> asObservable(crossinline body: (StreamObserver<T>) -> Unit): Observable<T> {
    return Observable.create { subscription ->
        val observer = object : StreamObserver<T> {
            override fun onNext(value: T) {
                subscription.onNext(value)
            }

            override fun onError(error: Throwable) {
                subscription.onError(error)
            }

            override fun onCompleted() {
                subscription.onComplete()
            }
        }
        body(observer)
    }
}

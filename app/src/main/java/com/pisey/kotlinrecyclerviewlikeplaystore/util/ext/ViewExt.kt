package com.pisey.kotlinrecyclerviewlikeplaystore.util.ext

import android.view.View

fun View.toVisible() {
    visibility = View.VISIBLE
}

fun View.toInvisible() {
    visibility = View.INVISIBLE
}

fun View.toGone() {
    visibility = View.GONE
}
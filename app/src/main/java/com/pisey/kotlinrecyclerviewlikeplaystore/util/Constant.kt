/*
 * Copyright (c) 2019. Pisey Sen.
 * @Created by piseysen on 6/12/19 2:17 PM
 */

package com.pisey.kotlinrecyclerviewlikeplaystore.util

import com.pisey.kotlinrecyclerviewlikeplaystore.BuildConfig

object Constant {
    const val COUNTRY_SERVICE_BASE_URL =BuildConfig.BASE_COUNTRY_URL

    object NavigateType {
        const val FOOD = 1
        const val COUNTRY = 2
        const val ABOUT = 3
    }

    object Key {
        const val HEADER_TITLE = "headerTitle"
        const val LIST_ITEM = "listItem"
        const val MY_DATA = "MyData"
    }
}
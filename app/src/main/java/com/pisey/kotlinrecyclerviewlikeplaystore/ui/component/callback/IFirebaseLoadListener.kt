/*
 * @Created by piseysen on 5/23/19 11:37 AM
 */

package com.pisey.kotlinrecyclerviewlikeplaystore.ui.component.callback

import com.pisey.kotlinrecyclerviewlikeplaystore.data.model.MyData


interface IFirebaseLoadListener {
    fun onFirebaseLoadSuccess(itemGroupList: MutableList<MyData>)
    fun onFirebaseLoadFailed(message: String)
}

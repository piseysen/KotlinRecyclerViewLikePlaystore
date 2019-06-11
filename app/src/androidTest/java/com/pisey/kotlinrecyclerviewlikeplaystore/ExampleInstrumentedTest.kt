/*
 * Copyright (c) 2019. Cosync, IO.
 * @Author: Cosync, Inc
 * @Created by piseysen on 6/10/19 2:49 PM
 */

package com.pisey.kotlinrecyclerviewlikeplaystore

import androidx.test.InstrumentationRegistry
import androidx.test.runner.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        assertEquals("com.pisey.kotlinrecyclerviewlikeplaystore", appContext.packageName)
    }
}

package com.pisey.kotlinrecyclerviewlikeplaystore.data.local.Entity

import android.os.Build
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.pisey.kotlinrecyclerviewlikeplaystore.BuildConfig

@Entity(tableName = "device")
data class DeviceEntity constructor(
    @PrimaryKey
    @ColumnInfo(name = "device_id")
    val deviceId: String,

    val model: String = "${Build.BRAND} ${Build.MODEL}",

    val os: String = "android",

    @ColumnInfo(name = "os_version")
    val osVersion: String = Build.VERSION.RELEASE,

    @ColumnInfo(name = "app_version")
    val appVersion: String = BuildConfig.VERSION_NAME,

    @ColumnInfo(name = "user_agent")
    val userAgent: String,

    @ColumnInfo(name = "source_ip")
    val sourceIp: String? = null
)
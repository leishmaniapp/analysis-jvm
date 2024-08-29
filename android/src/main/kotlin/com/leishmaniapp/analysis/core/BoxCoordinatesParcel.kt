package com.leishmaniapp.analysis.core

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * an Android [Parcelable] implementation of [BoxCoordinates]
 */
@Parcelize
data class BoxCoordinatesParcel(
    @get:JvmName("getXCoordKt") val x: Int,
    @get:JvmName("getYCoordKt") val y: Int,
    @get:JvmName("getWCoordKt") val w: Int,
    @get:JvmName("getHCoordKt") val h: Int,
) :
    BoxCoordinates(x, y, w, h),
    Parcelable

package com.leishmaniapp.analysis.core

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * an Android [Parcelable] implementation of [CartesianCoordinates]
 */
@Parcelize
data class CartesianCoordinatesParcel(
    @get:JvmName("getXCoordKt") val x: Int,
    @get:JvmName("getYCoordKt") val y: Int
) :
    CartesianCoordinates(x, y),
    Parcelable

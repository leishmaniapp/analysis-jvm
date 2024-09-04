package com.leishmaniapp.analysis.core

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * an Android [Parcelable] implementation of [AnalysisResults]
 */
@Parcelize
data class AnalysisResultsParcel(
    @get:JvmName("getModelKt") val model: String,
    @get:JvmName("getVersionKt") val version: String,
    @get:JvmName("getStatusKt") val status: AnalysisStatus,
    @get:JvmName("getResultsKt") val results: Map<String, List<BoxCoordinatesParcel>>?
) :
    AnalysisResults(model, version, status, results),
    Parcelable

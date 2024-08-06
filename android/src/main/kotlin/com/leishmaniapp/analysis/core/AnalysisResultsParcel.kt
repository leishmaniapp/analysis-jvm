package com.leishmaniapp.analysis.core

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * an Android [Parcelable] implementation of [AnalysisResults]
 */
@Parcelize
data class AnalysisResultsParcel(
    val model: String,
    val status: AnalysisStatus,
    val results: Map<String, List<CartesianCoordinatesParcel>>
) :
    AnalysisResults(model, status, results),
    Parcelable

package com.leishmaniapp.analysis.lam.service

import android.app.Service
import android.os.Messenger
import android.os.Parcelable
import com.leishmaniapp.analysis.core.AnalysisResultsParcel
import kotlinx.parcelize.Parcelize
import java.util.UUID

/**
 * Android response type within [Messenger] for a Bound [Service]'s LAM module
 */
@Parcelize
data class LamAnalysisResponse(
    /**
     * Diagnosis UUID for which the sample belongs to
     */
    val diagnosis: UUID,

    /**
     * Sample number
     */
    val sample: Int,

    /**
     * Analysis results for the sample
     */
    val results: AnalysisResultsParcel,

    ) : Parcelable
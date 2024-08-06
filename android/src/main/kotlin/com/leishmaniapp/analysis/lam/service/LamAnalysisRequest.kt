package com.leishmaniapp.analysis.lam.service

import android.app.Service
import android.net.Uri
import android.os.Messenger
import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.util.UUID

/**
 * Android request type within [Messenger] for a Bound [Service]'s LAM module
 */
@Parcelize
data class LamAnalysisRequest(

    /**
     * Diagnosis UUID for which the sample belongs to
     */
    val diagnosis: UUID,

    /**
     * Sample number
     */
    val sample: Int,

    /**
     * Local path to the image sample to be analyzed
     */
    val uri: Uri,

    ) : Parcelable
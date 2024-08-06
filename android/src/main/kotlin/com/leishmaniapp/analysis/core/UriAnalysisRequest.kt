package com.leishmaniapp.analysis.core

import android.net.Uri
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 *
 */
@Parcelize
data class UriAnalysisRequest(val uri: Uri) : Parcelable

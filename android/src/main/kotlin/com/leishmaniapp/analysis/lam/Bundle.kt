package com.leishmaniapp.analysis.lam

import android.os.Build
import android.os.Bundle
import androidx.core.os.bundleOf

/**
 * Key within [Bundle] to access [LamAnalysisRequest] as parcel
 */
const val BUNDLE_REQUEST_KEY: String = "LAM_REQUEST_BUNDLE"

/**
 * Key within [Bundle] to access [LamAnalysisResponse] as parcel
 */
const val BUNDLE_RESPONSE_KEY: String = "LAM_RESPONSE_BUNDLE"

/**
 * Wrap [LamAnalysisRequest] into a [Bundle] with [BUNDLE_REQUEST_KEY] as key
 */
fun LamAnalysisRequest.toBundle(): Bundle = bundleOf(
    BUNDLE_REQUEST_KEY to this
)

/**
 * Get a [LamAnalysisRequest] contained within a [Bundle] with [BUNDLE_REQUEST_KEY] as key using
 * the application's [ClassLoader].
 *
 * The value of [classLoader] can be obtained using [android.content.Context.getClassLoader]
 * from the application context
 */
fun LamAnalysisRequest.Companion.fromBundle(
    bundle: Bundle,
    classLoader: ClassLoader
): LamAnalysisRequest? =
    bundle.run {
        // Set the class loader for the bundle
        this.classLoader = classLoader

        // Get the parcel
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            getParcelable(BUNDLE_REQUEST_KEY, LamAnalysisRequest::class.java)
        } else {
            @Suppress("DEPRECATION")
            getParcelable(BUNDLE_REQUEST_KEY)
        }
    }

/**
 * Wrap [LamAnalysisResponse] into a [Bundle] with [BUNDLE_RESPONSE_KEY] as key
 */
fun LamAnalysisResponse.toBundle(): Bundle = bundleOf(
    BUNDLE_RESPONSE_KEY to this
)

/**
 * Get a [LamAnalysisResponse] contained within a [Bundle] with [BUNDLE_RESPONSE_KEY] as key using
 * the application's [ClassLoader].
 *
 * The value of [classLoader] can be obtained using [android.content.Context.getClassLoader]
 * from the application context
 */
fun LamAnalysisResponse.Companion.fromBundle(
    bundle: Bundle,
    classLoader: ClassLoader
): LamAnalysisResponse? =
    bundle.run {
        // Set the class loader for the bundle
        this.classLoader = classLoader

        // Get the parcel
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            getParcelable(BUNDLE_RESPONSE_KEY, LamAnalysisResponse::class.java)
        } else {
            @Suppress("DEPRECATION")
            getParcelable(BUNDLE_RESPONSE_KEY)
        }
    }
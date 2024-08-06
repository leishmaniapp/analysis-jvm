package com.leishmaniapp.analysis.core;

/**
 * Specifies the status response from the analysis service
 */
public enum AnalysisStatus {
    /**
     * Local analysis successful
     */
    OK,

    /**
     * The provided {@link java.io.File} was not valid
     */
    INVALID_FILE,

    /**
     * The image provided cannot be processed
     */
    UNPROCESSABLE_CONTENT,
}

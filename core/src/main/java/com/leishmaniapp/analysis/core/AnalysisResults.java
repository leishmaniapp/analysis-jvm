package com.leishmaniapp.analysis.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;

/**
 * Local analysis results
 */
@Data
@AllArgsConstructor
public class AnalysisResults {

    /**
     * Private default constructor
     */
    protected AnalysisResults() {
    }

    /**
     * Model/Diasease ID for the Disease
     */
    @NotNull
    protected String model;

    /**
     * Success or failure code
     */
    @NotNull
    protected AnalysisStatus status;

    /**
     * A map in which the key represent a diagnostic element and the list of coordinates were it was found
     */
    @Nullable
    protected Map<String, List<CartesianCoordinates>> results;
}

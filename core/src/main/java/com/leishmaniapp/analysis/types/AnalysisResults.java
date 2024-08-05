package com.leishmaniapp.analysis.types;

import lombok.Data;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;

/**
 * Local analysis results
 */
@Data
public class AnalysisResults {

    /**
     * Private default constructor
     */
    private AnalysisResults() {
    }

    /**
     * Model/Diasease ID for the Disease
     */
    @NotNull
    String model;

    /**
     * Success or failure code
     */
    @NotNull
    AnalysisStatus status;

    /**
     * A map in which the key represent a diagnostic element and the list of coordinates were it was found
     */
    @Nullable
    Map<String, List<CartesianCoordinates>> results;
}

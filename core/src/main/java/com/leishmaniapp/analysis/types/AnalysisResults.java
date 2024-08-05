package com.leishmaniapp.analysis.types;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.Map;

/**
 * Local analysis results
 *
 * @param model   Model/Diasease ID for the Disease
 * @param status  Success or failure code
 * @param results A map in which the key represent a diagnostic element and the list of coordinates were it was found
 */
public record AnalysisResults(
        @NotNull String model,
        @NotNull AnalysisStatus status,
        @Nullable Map<String, List<CartesianCoordinates>> results
) {
}

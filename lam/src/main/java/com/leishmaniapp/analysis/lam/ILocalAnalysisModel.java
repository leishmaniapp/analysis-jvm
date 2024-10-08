package com.leishmaniapp.analysis.lam;

import com.leishmaniapp.analysis.lam.exception.LamException;
import com.leishmaniapp.analysis.core.BoxCoordinates;
import org.jetbrains.annotations.NotNull;

import java.io.File;
import java.util.List;
import java.util.Map;

/**
 * LAM (Local Analysis Model) interface definition
 */
public interface ILocalAnalysisModel {

    /**
     * Get the analysis model ID
     *
     * @return ID for the current analysis model
     */
    @NotNull
    String getModel();

    /**
     * Load required resources into memory
     *
     * @throws LamException Failed to load the model
     */
    void load() throws LamException;

    /**
     * Analyze a given diagnostic image sample file
     *
     * @param content File with image to be analyzed
     * @throws LamException The model was not loaded or failed to analyze the image
     * @return A map in which the key represent a diagnostic element and the list of box coordinates were it was found
     */
    @NotNull
    Map<String, List<BoxCoordinates>> analyze(@NotNull File content) throws LamException;
}

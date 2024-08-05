package com.leishmaniapp.analysis.lam.exception;

/**
 * Native module was not loaded
 */
public class LamNotLoadedException extends LamException {

    /**
     * Construct a new {@link LamNotLoadedException}
     *
     * @param modelId Analysis model or disease ID
     */
    public LamNotLoadedException(String modelId) {
        super(modelId, "LAM module was not loaded");
    }
}

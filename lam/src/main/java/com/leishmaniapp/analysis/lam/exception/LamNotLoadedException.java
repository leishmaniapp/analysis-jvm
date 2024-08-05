package com.leishmaniapp.analysis.lam.exception;

/**
 * Native module was not loaded
 */
public class LamNotLoadedException extends LamException {
    public LamNotLoadedException(String modelId) {
        super(modelId, "LAM module was not loaded");
    }
}

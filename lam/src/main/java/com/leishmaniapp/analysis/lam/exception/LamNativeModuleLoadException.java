package com.leishmaniapp.analysis.lam.exception;

/**
 * Native module failed to load
 */
public class LamNativeModuleLoadException extends LamException {

    /**
     * Construct a new {@link LamNativeModuleLoadException}
     *
     * @param modelId Analysis model or disease ID
     * @param cause   Parent cause for the exception
     */
    public LamNativeModuleLoadException(String modelId, Throwable cause) {
        super(modelId, "Failed to load native module", cause);
    }
}

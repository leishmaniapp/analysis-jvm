package com.leishmaniapp.analysis.lam.exception;

/**
 * Native module failed to load
 */
public class LamNativeModuleLoadException extends LamException {
    public LamNativeModuleLoadException(String modelId, Throwable cause) {
        super(modelId, "Failed to load native module", cause);
    }
}

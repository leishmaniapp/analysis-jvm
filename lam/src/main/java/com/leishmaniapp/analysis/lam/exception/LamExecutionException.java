package com.leishmaniapp.analysis.lam.exception;

public class LamExecutionException extends LamException {
    public LamExecutionException(String modelId, Throwable cause) {
        super(modelId, "Failure during model execution", cause);
    }
}

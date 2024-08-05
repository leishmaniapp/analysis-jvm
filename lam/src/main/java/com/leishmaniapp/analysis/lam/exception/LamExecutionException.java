package com.leishmaniapp.analysis.lam.exception;

/**
 * Failure during LAM model execution
 */
public class LamExecutionException extends LamException {

    /**
     * Construct a new {@link LamExecutionException}
     *
     * @param modelId Analysis model or disease ID
     * @param cause   Parent cause for the exception
     */
    public LamExecutionException(String modelId, Throwable cause) {
        super(modelId, "Failure during model execution", cause);
    }
}

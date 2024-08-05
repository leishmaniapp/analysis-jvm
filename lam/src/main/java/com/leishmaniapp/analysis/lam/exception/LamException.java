package com.leishmaniapp.analysis.lam.exception;

/**
 * LAM-specific exception, wrapper for another child exception
 */
public class LamException extends Exception {

    /**
     * Constructs a new LAM exception with the specified detail message.
     *
     * @param modelId ID for the diagnostic model being used
     * @param message Detailed error message
     */
    public LamException(String modelId, String message) {
        super(String.format("LAM(%s)_Exception[UnknownCause]: %s", modelId, message));
    }

    /**
     * Constructs a new LAM exception with the specified detail message and cause.
     *
     * @param modelId ID for the diagnostic model being used
     * @param message Detailed error message
     * @param cause   Cause of the exception
     */
    public LamException(String modelId, String message, Throwable cause) {
        super(String.format("LAM(%s)_Exception[Cause=%s]: %s", modelId, cause.getClass().getSimpleName(), message), cause);
    }

    /**
     * Constructs a new LAM exception with the specified cause and no description message.
     *
     * @param modelId ID for the diagnostic model being used
     * @param cause   Cause of the exception
     */
    public LamException(String modelId, Throwable cause) {
        super(String.format("LAM(%s)_Exception[Cause=%s]: Unspecified exception details", modelId, cause.getClass().getSimpleName()), cause);
    }
}

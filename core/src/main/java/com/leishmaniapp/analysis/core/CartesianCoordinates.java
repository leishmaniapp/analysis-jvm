package com.leishmaniapp.analysis.core;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.jetbrains.annotations.NotNull;

/**
 * Two-dimensional pair of coordinates (x, y) in an image
 */
@Data
@AllArgsConstructor
public class CartesianCoordinates {

    /**
     * Private default constructor
     */
    private CartesianCoordinates() {}

    /**
     * X coordinate, in pixels
     */
    @NotNull
    Integer x;

    /**
     * Y coordinate, in pixels
     */
    @NotNull
    Integer y;
}

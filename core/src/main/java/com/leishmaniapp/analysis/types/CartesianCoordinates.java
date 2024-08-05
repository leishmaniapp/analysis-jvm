package com.leishmaniapp.analysis.types;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

/**
 * Two-dimensional pair of coordinates (x, y) in an image
 */
@Data
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

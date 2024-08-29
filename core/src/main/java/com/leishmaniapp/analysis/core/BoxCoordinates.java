package com.leishmaniapp.analysis.core;

import lombok.AllArgsConstructor;
import lombok.Data;

import org.jetbrains.annotations.NotNull;

/**
 * Bounding box coordinates and dimentions
 */
@Data
@AllArgsConstructor
public class BoxCoordinates {

    /**
     * Private default constructor
     */
    protected BoxCoordinates() {
    }

    /**
     * X coordinate, in pixels
     */
    @NotNull
    protected Integer x;

    /**
     * Y coordinate, in pixels
     */
    @NotNull
    protected Integer y;

    /**
     * Box width, in pixels
     */
    @NotNull
    protected Integer w;

    /**
     * Box height, in pixels
     */
    @NotNull
    protected Integer h;
}

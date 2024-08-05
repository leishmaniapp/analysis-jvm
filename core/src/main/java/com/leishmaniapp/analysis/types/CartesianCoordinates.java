package com.leishmaniapp.analysis.types;

import org.jetbrains.annotations.NotNull;

/**
 * Two-dimensional pair of coordinates (x, y) in an image
 */
public record CartesianCoordinates(@NotNull Integer x, @NotNull Integer y) {
}

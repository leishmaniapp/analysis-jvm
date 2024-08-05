package com.leishmaniapp.analysis.types;

import lombok.Data;
import org.jetbrains.annotations.NotNull;

/**
 * Two-dimensional pair of coordinates (x, y) in an image
 */
@Data
public class CartesianCoordinates {
    @NotNull
    Integer x;
    
    @NotNull
    Integer y;
}

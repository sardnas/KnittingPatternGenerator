package org.example;

import org.example.enums.Garment;

public class CalculatedInstructions {
    private int increases;
    private int decreases;
    private int HKLengthCm;
    private int HKRibDimension;

    public CalculatedInstructions(Swatch swatch, Garment garment, boolean vNeck, boolean raglan, boolean germanShortRows) {
        calculateIncreases();
        calculateDecreases();
    }
    private void calculateIncreases(){
        this.increases = 0;
    }
    private void calculateDecreases(){
        this.decreases = 0;
    }
}

package org.example;

import org.example.enums.Garment;
import org.example.enums.Size;

public class Pattern {
    private Garment garment;
    private Size size;
    private Swatch[] swatches;
    public Pattern(Size size, Swatch[] swatches, Garment garment) {
        this.size = size;
        this.swatches = swatches;
        this.garment = garment;
    }
    public Size getSize() {
        return size;
    }
    public Swatch[] getSwatches() {
        return swatches;
    }
    public Garment getGarment(){
        return garment;
    }

    private int UM(){ // Uppläggningsmaskor
    }
    private int HK(){ // Halskant
    }
    private int OK(){ // Raglanökningar
    }
    private int B(){ // Bål
    }
    private int A(){ // Arm
    }
}

package org.example;

import org.example.enums.Garment;
import org.example.enums.Size;

import java.util.List;

public class CalculatedInstructions {
    private Size size;
    private Swatch ribSwatch;
    private Swatch bodySwatch;
    private StringBuilder sweaterPattern;

    public CalculatedInstructions(Size size, List<Swatch> swatches, boolean vNeck, boolean raglan, boolean germanShortRows ) {
        this.size = size;
        this.ribSwatch = swatches.get(1);
        this.bodySwatch = swatches.get(0);
        this.sweaterPattern = new StringBuilder();
        this.sweaterPattern.append(calculateUm(vNeck));
        this.sweaterPattern.append(calculateHk(vNeck));
        this.sweaterPattern.append(calculateOk(raglan, germanShortRows));
        this.sweaterPattern.append(calculateB(vNeck));
        this.sweaterPattern.append(calculateA());
    }

    public StringBuilder getSweaterPattern() {
        return sweaterPattern;
    }

    public Size getSize() {
        return size;
    }

    public Swatch getRibSwatch() {
        return ribSwatch;
    }

    public Swatch getBodySwatch() {
        return bodySwatch;
    }

    private double getSizeFactor(){
        double factor;
        switch(this.size) {
            case XS:
                factor = 0.85;
            case S:
                factor = 1;
            case M:
                factor = 1.1;
            case L:
                factor = 1.25;
            case XL:
                factor = 1.35;
            default:
                factor = 1;
        }
        return factor;
    }
    private String calculateUm(boolean vNeck){
        double sizeFactor = getSizeFactor();
        return null;
    }
    private String calculateHk(boolean vNeck){
        double sizeFactor = getSizeFactor();
        return null;
    }
    private String calculateOk(boolean raglan, boolean germanShortRows){
        double sizeFactor = getSizeFactor();
        return null;
    }
    private String calculateB(boolean vNeck){
        double sizeFactor = getSizeFactor();
        return null;
    }
    private String calculateA(){
        double sizeFactor = getSizeFactor();
        return null;
    }
}

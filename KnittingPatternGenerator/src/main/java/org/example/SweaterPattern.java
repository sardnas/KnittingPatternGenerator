package org.example;

import org.example.enums.Garment;
import org.example.enums.Size;
import org.example.enums.StitchType;

import java.util.List;

public class SweaterPattern {
    private Size size;
    private List<Swatch> swatches;
    private boolean vNeck;
    private boolean raglan;
    private boolean germanShortRows;

    public SweaterPattern(Size size, List<Swatch> swatches, boolean vNeck, boolean raglan, boolean germanShortRows) {
        this.size = size;
        this.swatches = swatches;
        this.vNeck = vNeck;
        this.raglan = raglan;
        this.germanShortRows = germanShortRows;
    }
    public Size getSize() {
        return size;
    }
    public List<Swatch> getSwatches() {
        return swatches;
    }

    private int getUM(){ // Uppläggningsmaskor
        return 0;
    }
    private CalculatedInstructions getHK(){ // Halskant
        CalculatedInstructions HK = new CalculatedInstructions(swatches.get(0), Garment.Sweater, vNeck, raglan, germanShortRows);
        return HK;
    }
    private CalculatedInstructions getOK(){ // Raglanökningar, German shortrows, etc
        CalculatedInstructions OK = new CalculatedInstructions(swatches.get(0), Garment.Sweater, vNeck, raglan, germanShortRows);
        return OK;
    }
    private CalculatedInstructions getB(){ // Bål
        CalculatedInstructions B = new CalculatedInstructions(swatches.get(0), Garment.Sweater, vNeck, raglan, germanShortRows);
        return B;
    }
    private CalculatedInstructions getA(){ // Arm
        CalculatedInstructions A = new CalculatedInstructions(swatches.get(0), Garment.Sweater, vNeck, raglan, germanShortRows);
        return A;
    }
    public StringBuilder getPattern() {
        StringBuilder patternBuilder = new StringBuilder();
        String UM = String.format("Lägg upp %s maskor på en %s mm stickningsnål.\n", getUM(), swatches.get(1).getNeedleSizeMm());
        String HK;
        String OK1;
        String OK2;

        if(vNeck){
            HK = String.format("V-hals instruktion\n");
        }else{
            HK = String.format("Sticka %s (%s räta %s aviga) tills halskanten mäter %s cm.\n", (swatches.get(1).getStitchType() == StitchType.Rib) ? "resår" : "N/A", 1, 1, getHK().getDecreases());
        }
        if(raglan){
            OK1 = String.format("Raglan instruktion\n");
        }else{
            OK1 = String.format("Ok instruktion\n");
        }
        if(germanShortRows){
            OK2 = String.format("German short rows instruktion\n");
        }else{
            OK2 = String.format("Annat instruktion\n");
        }
        String AV = String.format("Armmaskor till vila instruktion\n");
        String B = String.format("Bål instruktion\n");
        String A = String.format("Arm instruktion");

        patternBuilder.append(UM);
        patternBuilder.append(HK);
        patternBuilder.append(OK1);
        patternBuilder.append(OK2);
        patternBuilder.append(AV);
        patternBuilder.append(B);
        patternBuilder.append(A);
        return patternBuilder;
    }
}

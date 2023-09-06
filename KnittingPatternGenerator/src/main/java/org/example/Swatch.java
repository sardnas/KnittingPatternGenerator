package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.example.enums.Material;
import org.example.enums.StitchType;
import org.example.enums.YarnWeight;

import java.util.HashMap;
import java.util.Map;

public class Swatch {
    private double needleSizeMm;
    private int heightCm;
    private int widthCm;
    private Map<String, Integer> stitches;
    private Material material;
    private StitchType stitchType;
    private YarnWeight yarnWeight;

    public Swatch(@JsonProperty("needleSizeMm") double needleSizeMm, @JsonProperty("heightCm") int heightCm,@JsonProperty("widthCm") int widthCm, @JsonProperty("stitches") String stitches,  @JsonProperty("material") Material material,@JsonProperty("stitchType") StitchType stitchType,@JsonProperty("yarnWeight") YarnWeight yarnWeight) {
        this.needleSizeMm = needleSizeMm;
        this.heightCm = heightCm;
        this.widthCm = widthCm;
        this.material = material;
        this.stitchType = stitchType;
        this.yarnWeight = yarnWeight;
        this.stitches = setStitches(stitches);

    }
    private Map<String, Integer> setStitches(String stitches){
        String key1 = "maskor";
        String key2 = "varv";
        String[] split = stitches.split("x");
        int m = Integer.parseInt(split[0]);
        int v = Integer.parseInt(split[1]);
        Map<String, Integer> stitchMap = new HashMap<>();
        stitchMap.put(key1, m);
        stitchMap.put(key2, v);
        return stitchMap;
    }
    public double getNeedleSizeMm() {
        return needleSizeMm;
    }

    public int getHeightCm() {
        return heightCm;
    }

    public int getWidthCm() {
        return widthCm;
    }

    public Map<String, Integer> getStitches() {
        return stitches;
    }

    public Material getMaterial() {
        return material;
    }

    public StitchType getStitchType() {
        return stitchType;
    }

    public YarnWeight getYarnWeight() {
        return yarnWeight;
    }
}

package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.example.enums.Material;
import org.example.enums.StitchType;
import org.example.enums.YarnWeight;

public class Swatch {
    private double needleSizeMm;
    private int heightCm;
    private int widthCm;
    private Material material;
    private StitchType stitchType;
    private YarnWeight yarnWeight;

    public Swatch(@JsonProperty("needleSizeMm") double needleSizeMm, @JsonProperty("heightCm") int heightCm,@JsonProperty("widthCm") int widthCm, @JsonProperty("material") Material material,@JsonProperty("stitchType") StitchType stitchType,@JsonProperty("yarnWeight") YarnWeight yarnWeight) {
        this.needleSizeMm = needleSizeMm;
        this.heightCm = heightCm;
        this.widthCm = widthCm;
        this.material = material;
        this.stitchType = stitchType;
        this.yarnWeight = yarnWeight;
    }

    public double getNeedleSizeMm() {
        return needleSizeMm;
    }

    public void setNeedleSizeMm(int needleSizeMm) {
        this.needleSizeMm = needleSizeMm;
    }

    public int getHeightCm() {
        return heightCm;
    }

    public void setHeightCm(int heightCm) {
        this.heightCm = heightCm;
    }

    public int getWidthCm() {
        return widthCm;
    }

    public void setWidthCm(int widthCm) {
        this.widthCm = widthCm;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public StitchType getStitchType() {
        return stitchType;
    }

    public void setStitchType(StitchType stitchType) {
        this.stitchType = stitchType;
    }

    public YarnWeight getYarnWeight() {
        return yarnWeight;
    }

    public void setYarnWeight(YarnWeight yarnWeight) {
        this.yarnWeight = yarnWeight;
    }
}

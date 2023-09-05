package org.example;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.enums.Size;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        List<Swatch> swatches = generateListOfSwatches();
        SweaterPattern pattern = new SweaterPattern(Size.M, swatches, false, false, false);
        System.out.println(pattern.getPattern());
    }

    private static List<Swatch> generateListOfSwatches() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File json = new File("src/main/resources/swatchData.json");
        List<Swatch> swatches = objectMapper.readValue(json, new TypeReference<List<Swatch>>(){});
        return swatches;
    }
}
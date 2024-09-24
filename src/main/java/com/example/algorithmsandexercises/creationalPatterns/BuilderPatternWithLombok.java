package com.example.algorithmsandexercises.creationalPatterns;


import lombok.Builder;

import java.util.List;

@Builder
public class BuilderPatternWithLombok {

    private final String roll;
    private final int burgers;
    private List<String> ingredients;
    private final String sauce;

    @Override
    public String toString() {
        return "BuilderPatternWithLombok{" +
                "roll='" + roll + '\'' +
                ", burgers=" + burgers +
                ", ingredients=" + ingredients +
                ", sauce='" + sauce + '\'' +
                '}';
    }

    public static void main(String[] args) {
        BuilderPatternWithLombok bigMac = BuilderPatternWithLombok.builder()
                .roll("bułka z sezamem")
                .burgers(2)
                .sauce("barbecue")
                .ingredients(List.of("sałata", "cebula", "bekon"))
                .build();
        System.out.println(bigMac);
    }
}



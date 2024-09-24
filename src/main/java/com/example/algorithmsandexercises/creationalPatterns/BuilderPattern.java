package com.example.algorithmsandexercises.creationalPatterns;

import java.util.ArrayList;
import java.util.List;

public class BuilderPattern {

    private final String roll;
    private final int burgers;
    private List<String> ingredients;
    private final String sauce;

    public BuilderPattern(String roll, int burgers, List<String> ingredients, String sauce) {
        this.roll = roll;
        this.burgers = burgers;
        this.ingredients = new ArrayList<>(ingredients);
        this.sauce = sauce;
    }

    @Override
    public String toString() {
        return "BuilderPattern{" +
                "roll='" + roll + '\'' +
                ", burgers=" + burgers +
                ", ingredients=" + ingredients +
                ", sauce='" + sauce + '\'' +
                '}';
    }

    public static class BuilderPatternBuilder {
        private String roll;
        private int burgers;
        private String sauce;
        private List<String> ingredients = new ArrayList<>();

        public BuilderPatternBuilder roll(String roll) {
            this.roll = roll;
           return this;
        }

        public BuilderPatternBuilder burgers(int burgers) {
            this.burgers = burgers;
            return this;
        }

        public  BuilderPatternBuilder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public BuilderPatternBuilder ingredients(String ingerdient) {
            this.ingredients.add(ingerdient);
            return this;
        }

        public BuilderPattern build() {
            return new BuilderPattern(roll, burgers, ingredients, sauce);
        }

        public static void main(String[] args) {
            BuilderPattern bigMac = new BuilderPatternBuilder()
                    .roll("bułka z sezamem")
                    .burgers(2)
                    .sauce("barbecue")
                    .ingredients("sałata")
                    .ingredients("cebula")
                    .ingredients("ser")
                    .build();

            System.out.println(bigMac);



        }
    }
}

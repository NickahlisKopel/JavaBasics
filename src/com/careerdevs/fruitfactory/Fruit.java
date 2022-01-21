package com.careerdevs.fruitfactory;

public class Fruit {
    public String name;
    public String color;
    public boolean hasSeeds;

    public Fruit(String name, String color, boolean hasSeeds) {
        this.name = name;
        this.color = color;
        this.hasSeeds = hasSeeds;
    }

    @Override
    public String toString() {
        return "name: " + name +
                " color: " + color +
                " hasSeeds: " + hasSeeds;
    }
}

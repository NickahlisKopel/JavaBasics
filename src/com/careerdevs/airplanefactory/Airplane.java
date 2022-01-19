package com.careerdevs.airplanefactory;

public class Airplane {

    // passengers (int)
    // maxSpeed (float)
    // idCharacter (char)
    // airLineName (String)

    // 1) Fields
    public int passengers;
    public float maxSpeed;
    public char idCharacter;
    public String airLineName;

    // 2) Constructor/s
    public Airplane(int passengers, float maxSpeed, char idCharacter, String airLineName) {
        this.passengers = passengers;
        this.maxSpeed = maxSpeed;
        this.idCharacter = idCharacter;
        this.airLineName = airLineName;
    }

    // 3) Getter/Setters

    // 4) Other Methods


    @Override
    public String toString() {
        return "passengers: " + passengers +
                ", maxSpeed: " + maxSpeed +
                ", idCharacter: " + idCharacter +
                ", airLineName: " + airLineName;
    }
}

package com.careerdevs.companyfactory;

public class Company {
    public String name;
    public short yearEstablished;
    public double marketCap;

    public Company(String name, short yearEstablished, double marketCap) {
        this.name = name;
        this.yearEstablished = yearEstablished;
        this.marketCap = marketCap;
    }

    @Override
    public String toString() {
        return "name: " + name +
                " yearEstablished: " + yearEstablished +
                " marketCap: " + marketCap;
    }
}

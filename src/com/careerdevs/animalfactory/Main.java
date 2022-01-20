package com.careerdevs.animalfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Animal Species: ");
        String species = scanner.nextLine();

        System.out.print("Number of legs: ");
        short numOfLegs = scanner.nextShort();
        scanner.nextLine();

        System.out.println("it lives on land?");
        boolean livesOnLand = scanner.nextBoolean();

        Animal animal = new Animal(species,numOfLegs,livesOnLand);

    }
}

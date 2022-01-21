package com.careerdevs.fruitfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the name of the fruit?: ");
        String name = scanner.nextLine();

        System.out.print("What is the color of the fruit?: ");
        String color = scanner.nextLine();

        System.out.print("It has seeds?: ");
        boolean hasSeeds = scanner.nextBoolean();
        scanner.nextLine();

        Fruit fruit = new Fruit(name,color,hasSeeds);
        System.out.println(fruit);
    }
}

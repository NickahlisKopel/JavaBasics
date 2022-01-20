package com.careerdevs.countryfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is the name of the Country?: ");
        String name = scanner.nextLine();

        System.out.print("What is the Population?: ");
        long population = scanner.nextLong();
        scanner.nextLine();

        System.out.print("What is the Capital?: ");
        String capital = scanner.nextLine();

        Country country = new Country(name,population,capital);
        System.out.println(country);
    }
}

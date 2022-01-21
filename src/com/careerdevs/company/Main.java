package com.careerdevs.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name of Company?: ");
        String name = scanner.nextLine();

        System.out.print("What year was it established?: ");
        short yearEstablished = scanner.nextShort();
        scanner.nextLine();

        System.out.println("What is the Market Cap?: ");
        double marketCap = scanner.nextDouble();
        scanner.nextLine();

        Company company = new Company(name,yearEstablished,marketCap);
        System.out.println(company);

    }
}

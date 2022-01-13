package com.careerdevs.sayhello;

import com.careerdevs.NameGenerator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //whatIsYourName();
        whatIsYourFullName();
    }

    public static void whatIsYourName(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, nice to meet you " + name + ".");


    }

    public static void whatIsYourFullName(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.println("It is so nice to formally meet you, " + NameGenerator.generateFullName(firstName, lastName));
    }
}

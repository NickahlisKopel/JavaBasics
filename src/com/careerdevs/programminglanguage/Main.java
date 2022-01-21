package com.careerdevs.programminglanguage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Name of Programming Language?: ");
        String name = scanner.nextLine();

        System.out.print("it's Object Oriented?: ");
        boolean isObjectOriented = scanner.nextBoolean();
        scanner.nextLine();

        System.out.print("What is the File Extension?: ");
        String fileExtension = scanner.nextLine();

        ProgrammingLanguage programmingLanguage = new ProgrammingLanguage(name,isObjectOriented,fileExtension);
        System.out.println(programmingLanguage);
    }
}

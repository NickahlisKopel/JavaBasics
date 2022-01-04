package com.careerdevs;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String firstName = "Nickahlis";
        String lastName = "Kopel";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);
        System.out.println(createFullName("First","Last"));
        System.out.println(NameGenerator.generateFullName("Marry","Jane"));

    }

    public static String createFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }
}

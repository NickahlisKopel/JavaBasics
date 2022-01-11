package com.careerdevs;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        String firstName = "Nickahlis";
//        String lastName = "Kopel";
//        String fullName = firstName + " " + lastName;
//        System.out.println(fullName);
//        System.out.println(createFullName("First","Last"));
//        System.out.println(NameGenerator.generateFullName("Marry","Jane"));
        Car camaro = new Car("Camaro 2SS","Chevy",10000,0.10f);
        Car mustang = new Car("Mustang GT","Ford",30000,0.50f);
        Car hellcat = new Car("Hellcat","Dodge",100,0.90f);
        System.out.println("Make: " + camaro.make);
        System.out.println("Model: " + camaro.model);
        System.out.println("Make: " + mustang.make);
        System.out.println("Model: " + mustang.model);
        System.out.println("Make: " + hellcat.make);
        System.out.println("Model: " + hellcat.model);

    }


    public static String createFullName(String firstName, String lastName){
        return firstName + " " + lastName;
    }
}

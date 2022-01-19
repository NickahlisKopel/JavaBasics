package com.careerdevs.airplanefactory;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        createAPlane();
        //Airplane myAirplane = new Airplane(20,303.3f,'d',"Delta Airlines");
        //System.out.println(myAirplane.toString());
    }

    public static void createAPlane(){
        //step 0 create the Scanner instance
        Scanner scanner = new Scanner(System.in);

        //1st take user input
        System.out.print("Enter number of passengers: ");
         int passengers = scanner.nextInt();
         scanner.nextLine(); //clears the \n (newline character)
        System.out.print("Enter max speed: ");
         float maxSpeed = scanner.nextFloat();
         scanner.nextLine();
        System.out.print("Enter ID Character: ");
         char idCharacter = scanner.nextLine().charAt(0);

        System.out.print("Enter airline name: ");
         String airLineName = scanner.nextLine();

        System.out.println("End of User Input");

        //2nd create an Airplane instance
        Airplane airplane = new Airplane(passengers,maxSpeed,idCharacter,airLineName);
        //3rd print the fields' value in the terminal
        System.out.println(airplane);
    }
}

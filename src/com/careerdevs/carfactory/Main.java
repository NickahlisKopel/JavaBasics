package com.careerdevs.carfactory;

import com.careerdevs.Car;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //createACar();
        createACarObject();
    }

    public static void createACar(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name?: ");
        String owner = scanner.nextLine();

        System.out.print("What is the make of your car?: ");
        String make = scanner.nextLine();

        System.out.print("What is the model of your car?: ");
        String model = scanner.nextLine();

        System.out.println(owner + " owns the car " + make + " " + model);

    }
    public static void createACarObject(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Make: ");
        String make = scanner.nextLine();

        System.out.print("Model: ");
        String model = scanner.nextLine();

        System.out.print("Mileage: ");
        int mileage = scanner.nextInt();

        System.out.print("Gas Tank Percentage in decimal: ");
        float gasTankPercentage = scanner.nextFloat();

        Car car1 = new Car(make,model,mileage,gasTankPercentage);

        System.out.println("Make: " + car1.make + "\nModel: " + car1.model + "\nMileage: " + car1.mileage + "\nGas Tank Percentage: " + car1.gasTankPercent);


    }
}

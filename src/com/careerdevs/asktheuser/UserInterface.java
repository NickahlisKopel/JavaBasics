package com.careerdevs.asktheuser;

import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your age?: ");
        byte age = scanner.nextByte();
        scanner.nextLine();
        System.out.println("You're "+age+" years old.");

        System.out.print("How many days are in a year?: ");
        short daysInYear = scanner.nextShort();
        scanner.nextLine();
        if(daysInYear == 365){
            System.out.println( "Yes there is "+ daysInYear+ " days in a year.");
        }else{
            System.out.println("There isn't " + daysInYear + " days in a year. Theres 365 days.");
        }

        System.out.print("What is your favorite number?: ");
        int favoriteNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println(favoriteNumber+", That's a cool number!");

        System.out.print("What is your favorite decimal?: ");
        float favoriteFloat = scanner.nextFloat();
        scanner.nextLine();
        System.out.println(favoriteFloat+", That's interesting!");

        System.out.print("How old is the earth?: ");
        long ageOfEarth = scanner.nextLong();
        scanner.nextLine();
        if(ageOfEarth == 4543000000L){
            System.out.println("Yes, the earth is old!");
        }else{
            System.out.println("Sorry, the earth is 4,543,000,000 years old! ");
        }

        System.out.print("What is Pi?: ");
        double pi = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Pi ~= 3.14159265359 you said: "+pi+".");

        System.out.println("Gabe is amazing, true or false: ");
        boolean answer = scanner.nextBoolean();
        scanner.nextLine();
        if(answer){
            System.out.println("Its the only answer.");
        }else{
            System.out.println(".........");
        }

        System.out.println("What is your nickname?");
        String nickname = scanner.nextLine();
        System.out.println(nickname+", I like it!");

    }
}

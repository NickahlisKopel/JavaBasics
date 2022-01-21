package com.careerdevs.songfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Title of Song?: ");
        String title = scanner.nextLine();

        System.out.print("Artist of Song?: ");
        String artist = scanner.nextLine();

        System.out.print("Genre of Song?: ");
        String genre = scanner.nextLine();

        System.out.println("Length of the song in seconds?: ");
        int seconds = scanner.nextInt();

        Song song = new Song(title,artist,genre,seconds);
        System.out.println(song);
    }
}

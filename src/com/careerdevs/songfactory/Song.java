package com.careerdevs.songfactory;

public class Song {
    public String name;
    public String artist;
    public String genre;
    public int seconds;

    public Song(String name, String artist, String genre, int seconds) {
        this.name = name;
        this.artist = artist;
        this.genre = genre;
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return "name: " + name +
                " artist: " + artist +
                " genre: " + genre +
                " seconds: " + seconds;
    }
}

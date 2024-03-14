package com.mycompany.main;

/**
 * @author Michal Babik
 */

public class Song {
    private String title;
    private String artist;
    private String genre;

    public Song(String artist, String title, String genre) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }

    // Getters
    public String getTitle() { return title; }
    public String getArtist() { return artist; }
    public String getGenre() { return genre; }
    
    @Override
    public String toString() {
        return "Song title: " + title + " by " + artist + ", Genre: " + genre;
    }
}

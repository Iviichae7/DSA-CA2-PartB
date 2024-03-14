package com.mycompany.main.DLL;

import com.mycompany.main.Song;
import com.mycompany.main.interfaces.AppMang;

/**
 * @author Michal Babik
 */
public class GenrePlaylist implements AppMang {
    private Node head;
    private int size;
    private String genre;

    public GenrePlaylist(String genre) {
        this.head = null;
        this.size = 0;
        this.genre = genre;
    }
    public String getGenre() {
        return this.genre;
    }

    @Override
    public void addSong(Song song) {

    }
    
    @Override
    public String displaySongs() {
        return "";
    }

    @Override
    public int getSongCount() {
        return size;
    }

    public void deleteLastSong() {

    }

    public Song search() {
        return null;
    }
}

package com.mycompany.main.Stack;

/**
 * @author Michal Babik
 */

import com.mycompany.main.Song;
import com.mycompany.main.interfaces.SongMang;
import java.util.Stack;
import com.mycompany.main.interfaces.AppMang;

/**
 *
 * @author Administrator
 */
public class LikedSongs implements AppMang, SongMang {
    private Stack<Song> songs = new Stack<>();

    @Override
    public void addSong(Song song) {
    }

    @Override
    public String displaySongs() {
        return "";
    }

    @Override
    public int getSongCount() {
        return 0;
    }

    @Override
    public Song pop() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }
}

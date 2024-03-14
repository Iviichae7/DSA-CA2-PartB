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
    
    // Javas prebuilt stack
    private Stack<Song> songs = new Stack<>();
    private int size = 0;

    @Override
    public void addSong(Song song) {
        // Adds songs onto the stack and increments the size of the stack by one.
        songs.push(song);
        size++;
    }

    @Override
    public String displaySongs() {
        // To display songs - iterating through the stack and adding elements to sb and returning. 
        StringBuilder sb = new StringBuilder();
        for (Song song : songs) {
            sb.append(song.toString()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public int getSongCount() {
        return size;
    }

    @Override
    public Song pop() {
        // Checking wether the stack is not empty, then we can pop the element from the stack - otherwise its empty.
        if(!songs.isEmpty()){
            size--;
            return songs.pop();
        } else {
            return null;
        }
    }

    @Override
    public boolean isEmpty() {
        return songs.isEmpty();
    }

    @Override
    public int size() {
        return size;
    }
}

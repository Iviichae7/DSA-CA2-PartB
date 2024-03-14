package com.mycompany.main.interfaces;

/**
 * @author Michal Babik
 */

import com.mycompany.main.Song;

public interface SongMang {
    void addSong(Song song);
    Song pop();
    int size();
    boolean isEmpty();
}

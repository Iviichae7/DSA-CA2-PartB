package com.mycompany.main.interfaces;

/**
 * @author Michal Babik
 */

import com.mycompany.main.Song;

public interface AppMang {
    void addSong(Song song);
    String displaySongs();
    int getSongCount();
}

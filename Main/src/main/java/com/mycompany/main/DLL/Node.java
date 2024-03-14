package com.mycompany.main.DLL;

/**
 * @author Michal Babik
 */

import com.mycompany.main.Song;

/**
 *
 * @author Administrator
 */
public class Node {
 
    Song song;
    Node prev;
    Node next;

    public Node(Song song) {
        this.song = song;
        this.prev = null;
        this.next = null;
    }
}

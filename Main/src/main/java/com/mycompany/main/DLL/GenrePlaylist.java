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

        // Checking first if the genre is not matching - if not then we dont want to add it
        if(!song.getGenre().equals(this.genre)) return;

        // New song added to the node
        Node node = new Node(song);

        // If the head is empty then we make the new node the head
        if(head == null){
            head = node;
        } else {
            // Creating a new node and point it to the head so we dont manipulate the dll
            Node current = head;

            // If the head is not empty we iterate over the dll and find out the last node
            while(current.next != null){
                current = current.next;
            }

            // When we find last node we set the current node as the next reference
            current.next = node;
            // Then we cant forget to set the current node prev reference to the previous last node
            node.prev = current;
        }
        // Then we increment the dll
        size++;
    }
    
    @Override
    public String displaySongs() {
        StringBuilder sb = new StringBuilder();
        
        // Create a fake to itertate over the dll
        Node node = head;
        
        while(node != null){
            // On every node we add its data to our string
            sb.append(node.song.toString()).append("\n");
            
            // Move to the next node on each iteration
            node = node.next;
        }
        
        // Once all done we can print it
        return sb.toString();
    }

    @Override
    public int getSongCount() {
        return size;
    }

    public void deleteLastSong() {

    }

    public Song search(String artistName) {
        // Point new node to the head
        Node node = head;
        
        // While node is not empty we keep looping till empty
        while (node != null) {
            
            // If the artist name matches the name, then we want it
            if (node.song.getArtist().equalsIgnoreCase(artistName)) {
                return node.song;
            }
            // If it doesnt match we move onto the next node in the dll
            node = node.next;
        }
        return null;
    }
}

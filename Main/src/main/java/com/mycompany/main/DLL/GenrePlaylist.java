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
    @Override
    public void deleteLastSong() {
        // Checking first if the dll is empty
        if(head == null){
            return;
        }
        
        // Checking if the next node is empty
        if(head.next == null){
            // If it is then the dll is going to be empty
            head = null;
            size--;
            return;
        }
        
        // Two basic cases done
        // Now we need to iterate over the dll if there are more than two
        // Assigning the head to a temp node
        Node node = head;
        while(node.next.next != null){
            node = node.next;
        }
        // When we find second last node we can safely delete it
        node.next = null;
        size--;
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
    
    public void moveToTop() {
        // Checking first if the head is empty or the node.next is empty - if this is the case then there is nothing to do
        if (head == null || head.next == null) {
            return;
        }

        // Then we need to find the last node and 2nd last
        Node lastNode = head;
        
        Node secondToLast = null;
        
        // Go over the DLL as long as the last node next is not empty
        while (lastNode.next != null) {
            // Then we update the secondToLast to the node before moving forward making sure the secondToLast points to the node before last
            secondToLast = lastNode;
            lastNode = lastNode.next;
        }

        // Then we are removing the last node and updating 2nd last next pointer
        secondToLast.next = null;

        // Then we need to make sure last node prev pointer is pointing at nothing
        lastNode.prev = null;

        // Then last node next ref is the head
        lastNode.next = head;

        // Then the previous head sould point to the last node
        head.prev = lastNode;

        // Then the head points to the last node
        head = lastNode;
    }
    
    public Node getHead(){
        return this.head;
    }
}

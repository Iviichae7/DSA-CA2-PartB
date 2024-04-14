/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.main.Stack;

import com.mycompany.main.Song;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Administrator
 */
public class LikedSongsTest {
    
    public LikedSongsTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    @Test
    public void testAddSong() {
        Song song = new Song("Michal Babik", "Power Rangers", "Rap");
        
        LikedSongs likedSongs = new LikedSongs();
        likedSongs.addSong(song);
        
        assertFalse(likedSongs.isEmpty(), "Stack should not be empty");
        assertEquals(1, likedSongs.getSongCount(), "Song count should be 1");
    }

    @Test
    public void testDisplaySongs() {
        Song song1 = new Song("Michal Babik", "Hello There", "Rap");
        Song song2 = new Song("Michal Babik", "New Begininng", "Pop");
        
        LikedSongs likedSongs = new LikedSongs();
        likedSongs.addSong(song1);
        likedSongs.addSong(song2);
        
        String displayResult = likedSongs.displaySongs();
        assertTrue(displayResult.contains("Hello There") && displayResult.contains("New Begininng"), "Should display two songs.");
    }

    @Test
    public void testGetSongCount() {
        LikedSongs likedSongs = new LikedSongs();
        
        likedSongs.addSong(new Song("Michal Babik", "Hello", "Rap"));
        likedSongs.addSong(new Song("Michal Babik", "Goodbye", "Pop"));
        likedSongs.addSong(new Song("Michal Babik", "New", "Rap"));
        
        assertEquals(3, likedSongs.getSongCount(), "Should display correct count of songs.");
    }

    @Test
    public void testPop() {
        Song song = new Song("M.I.A", "Paper Planes", "Rap");
        
        LikedSongs likedSongs = new LikedSongs();
        likedSongs.addSong(song);
        
        Song popSong = likedSongs.pop();
        
        assertEquals(song.getTitle(), popSong.getTitle(), "Popped song should match the last added song.");
        assertTrue(likedSongs.isEmpty(), "Stack should be empty.");
    }
    
}

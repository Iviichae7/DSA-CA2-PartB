/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.main;

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
public class SongTest {
    
    public SongTest() {
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
    public void testGetTitle() {
        System.out.println("Testing the get Title method.");
        
        Song instance = new Song("Michal Babik", "Power Rangers", "Pop");
        
        String expResult = "Power Rangers";
        System.out.println("Expected result: " + expResult);
        
        String result = instance.getTitle();
        System.out.println("Actual result: " + result);
        
        assertEquals(expResult, result);
    }

    @Test
    public void testGetArtist() {
        System.out.println("Testing the get Artist method.");
        
        Song instance = new Song("Michal Babik", "Power Rangers", "Pop");
        
        String expResult = "Michal Babik";
        System.out.println("Expected result: " + expResult);
        
        String result = instance.getArtist();
        System.out.println("Actual result: " + result);
        
        assertEquals(expResult, result);
    }

    @Test
    public void testGetGenre() {
        System.out.println("Testing the get Genre Method.");
        
        Song instance = new Song("Michal Babik", "Power Rangers", "Pop");
        
        String expResult = "Pop";
        System.out.println("Expected result: " + expResult);
        
        String result = instance.getGenre();
        System.out.println("Actual result: " + result);
        
        assertEquals(expResult, result);
    }
    
}

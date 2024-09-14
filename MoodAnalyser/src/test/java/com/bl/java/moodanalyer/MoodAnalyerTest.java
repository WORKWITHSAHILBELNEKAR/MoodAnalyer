package com.bl.java.moodanalyer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyerTest {

    @Test
    public void givenMessage_WhenProper_ShouldReturnSad(){
        MoodAnalyer moodAnalyser = new MoodAnalyer();
        String result = moodAnalyser.analyseMood("I am In Sad mood.");
        System.out.println(result);
        assertEquals("Sad" , result);
    }
    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy(){
        MoodAnalyer moodAnalyser = new MoodAnalyer();
        String result = moodAnalyser.analyseMood("I am in a Happy Mood");
        System.out.println(result);
        assertEquals("Happy" , result);
    }
}
package com.bl.java.moodanalyer;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyserTest {

    @Test

    public void givenMessage_WhenProper_ShouldReturnSad(){
        MoodAnalyer moodAnalyser = new MoodAnalyer("I Am In Sad mood.");
        String result = moodAnalyser.analyseMood();
        System.out.println(result);
        assertEquals("SAD" , result);
    }
    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy(){
        MoodAnalyer moodAnalyser = new MoodAnalyer("I Am In a Happy mood.");
        String result = moodAnalyser.analyseMood();
        System.out.println(result);
        assertEquals("HAPPY" , result);
    }
}
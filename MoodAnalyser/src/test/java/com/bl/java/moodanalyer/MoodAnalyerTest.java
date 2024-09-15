package com.bl.java.moodanalyer;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoodAnalyerTest {

    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy(){
        MoodAnalyer moodAnalyser = new MoodAnalyer("I Am In Happy mood.");
        String result = moodAnalyser.analyseMood();
        System.out.println(result);
        assertEquals("HAPPY" , result);
    }
}
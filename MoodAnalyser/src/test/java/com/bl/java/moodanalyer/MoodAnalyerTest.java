package com.bl.java.moodanalyer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoodAnalyerTest {

    @Test
    public void givenMessage_WhenProper_ShouldReturnSad(){
        MoodAnalyer moodAnalyser = new MoodAnalyer();
        String result = moodAnalyser.analyseMood("I am In Happy mood.");
        System.out.println(result);
        assertEquals("Happy" , result);
    }


}
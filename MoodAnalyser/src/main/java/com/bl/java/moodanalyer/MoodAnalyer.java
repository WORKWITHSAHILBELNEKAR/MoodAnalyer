package com.bl.java.moodanalyer;

public class MoodAnalyer {
    // Method to analyze the mood based on the message
    public String analyseMood(String message) {
        if (message.contains("Sad")) {
            return "Sad";
        } else if (message.contains("Happy")) {
            return "Happy";
        } else
            return null;
    }
}

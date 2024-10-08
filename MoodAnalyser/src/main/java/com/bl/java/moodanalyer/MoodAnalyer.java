package com.bl.java.moodanalyer;

public class MoodAnalyer {
    // Method to analyze the mood based on the message

    public static String message;
    //constructor

    public MoodAnalyer(){

    }
    public MoodAnalyer(String message){
        this.message = message;
        analyseMood();
    }

    // Method to analyze the mood based on the message
    public String analyseMood()
    {
        try {

            if (message.contains("Sad")) {
                return "SAD";
            } else if (message.contains("Happy")) {
                return "HAPPY";
            }
        }
        catch (NullPointerException e){
            System.out.println("Please Enter the Valid Mood.");
        }

        return "HAPPY";
    }
    }
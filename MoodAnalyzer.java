package com.bridgelabz;

public class MoodAnalyzer {
    //TC1.1 : Given "I am in Sad Mood" message Should Return SAD
    //TC1.2 : Given "I am in Any Mood" message Should Return HAPPY
    private String message;
    public String analyzeMood(String mood) {
        if(message.contains("sad"))
            return "SAD";
        else if(message.contains("any"))
            return "HAPPY";
        return mood;
    }
    //Default Constructor
    public MoodAnalyzer() {

    }
    // Parameterized Constructor
    public MoodAnalyzer(String message) {
        this.message = message;
    }
}
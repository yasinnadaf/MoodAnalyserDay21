package com.bridgelabz.moodanalyser;

public class MoodAnalyser {

    public static void main(String[] args) {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String happyMood = moodAnalyser.analyseMood("Happy mood");
        System.out.println("Mood is "+happyMood);
        String sadMood = moodAnalyser.analyseMood("Sad mood");
        System.out.println("Mood is "+sadMood);

    }

    String analyseMood(String message){
        if(message.toLowerCase().contains("sad")){
            return "SAD";
        }
        else if (message.toLowerCase().contains("happy")){
            return "HAPPY";
        }
           return message;
        
    }
}

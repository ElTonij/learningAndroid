package com.example.couldthisbelove;

import java.util.Random;

public class LoveCalculator {
    public static void main(String[] args) {
        System.out.println("Your Love score is: " + ifYouHadMyLove("Mr X", "Miss Y."));

    }

    public static int ifYouHadMyLove(String yourName, String herName){
        Random randObject = new Random();
        int loveScore = randObject.nextInt(101);

        if(loveScore > 80){
            System.out.println(yourName + " and " + herName + "You love each other like Kanye and Kanye");
        } else if (loveScore > 40){
            System.out.println(yourName + " and " + herName + "You go together like coke and menthos");
        }
        else{
            System.out.println("No love. Sorry");
        }

        return loveScore;
    }
}

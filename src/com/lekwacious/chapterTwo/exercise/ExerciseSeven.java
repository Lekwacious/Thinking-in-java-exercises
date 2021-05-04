package com.lekwacious.chapterTwo.exercise;

import java.security.SecureRandom;
import java.util.Random;

public class ExerciseSeven {
    public static void main(String[] args) {
        SecureRandom randomNumber = new SecureRandom();
        int coin  = randomNumber.nextInt(10);
        if (coin % 2 == 0){
            System.out.println("heads");
        }
        else System.out.println("tails");
    }
}

package com.lekwacious.chapterThree.exercise;

import java.security.SecureRandom;
import java.util.Random;

public class ExerciseTwo {
    public static void main(String[] args) {
        SecureRandom randomnumber1 = new SecureRandom();
        SecureRandom randomnumber2 = new SecureRandom();

        for(int i = 0; i < 25; i++)
        {
            int x = randomnumber1.nextInt(25);
            int y = randomnumber1.nextInt(25);
            if(x < y)
            {
                System.out.println(x + " < " + y);
            }
            else if(x > y)
            {
                System.out.println(x + " > " + y);
            }
            else
            {
                System.out.println(x + " = " + y);
            }
        }

    }
}

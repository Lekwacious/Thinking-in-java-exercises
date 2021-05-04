package com.lekwacious.chapterThree.exercise;

public class ExerciseFour {
    public static void main(String[] args) {
        for(int i = 0; i < 100; i++ )
        {
            boolean isPrime =true;
            int factors = 0;
            for(int j = 2; j < i ; j++ )
            {
                if((i % j) == 0)
                {
                    isPrime = false;
                    break;
                }
                if (isPrime){
                    System.out.println(i + "are primenumbers");
                }
            }


        }
    }
}

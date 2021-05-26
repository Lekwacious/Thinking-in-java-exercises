package com.lekwacious.chapterThree.exercise;

public class ExerciseFour {
    public static void main(String[] args) {
//        for(int i = 0; i < 100; i++ )
//        {
//            boolean isPrime =true;
//            for(int j = 2; j < i ; j++ )
//            {
//                if(i % j == 0)
//                {
//                    isPrime = false;
//                }
//
//            }
//            if (isPrime){
//                System.out.println(i + " " + "is prime number");
//            }
//
//
//        }

        int firstNumber;
        int middleNumber;
        int increase;


        for (firstNumber = 1; firstNumber <= 100; firstNumber++) {
            increase = 0;


            for (middleNumber = 2; middleNumber < firstNumber; middleNumber++) {
                if ((firstNumber % middleNumber) == 0) {
                    increase = 1;
                }
            }
            if (increase == 0)
                System.out.print(firstNumber + "  ");
        }

    }
}

package com.lekwacious.chapterTwo.exercise;

public class ExerciseSix {
    public static void main(String[] args) {
        DogExerciseFive billy = new DogExerciseFive();
        billy.setName("Billy");
        billy.setSays("Ruff");


        DogExerciseFive bingo = new DogExerciseFive();
        bingo.setName("bingo");
        bingo.setSays("Wurf!");

        System.out.println(billy.getName());
        System.out.println(billy.speak());

        System.out.println(bingo.getName());
        System.out.println(bingo.speak());


        DogExerciseFive butch = new DogExerciseFive();
        butch.setName("Butch");
        butch.setSays("Hello!");
        System.out.println(butch.getName());
        System.out.println(butch.speak());

        System.out.println();
        System.out.println("Comparison: ");
        System.out.println("billy == butch: " + (billy == butch));
        System.out.println("spot.equals(butch): " + billy.equals(butch));
        System.out.println("butch.equals(spot): " + butch.equals(billy));
        System.out.println("Now assign: spot = butch");
        billy = butch;
        System.out.println();
        System.out.println("Compare again: ");
        System.out.println("spot == butch: " + (billy == butch));
        System.out.println("spot.equals(butch): " + billy.equals(butch));
        System.out.println("butch.equals(spot): " + butch.equals(billy));
        System.out.println("Spot: ");

        System.out.println(billy.getName());
        System.out.println(billy.speak());
        System.out.println("Butch: ");
        System.out.println(butch.getName());
        System.out.println(butch.speak());

    }
}

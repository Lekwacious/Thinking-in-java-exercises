package com.lekwacious.chapterTwo.exercise;

public class DogTestExerciseFive {
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

    }
}

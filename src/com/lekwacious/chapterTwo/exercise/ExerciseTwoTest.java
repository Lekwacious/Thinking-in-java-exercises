package com.lekwacious.chapterTwo.exercise;

public class ExerciseTwoTest {
    public static void main(String[] args) {
        ExerciseTwo obj = new ExerciseTwo();
        ExerciseTwo obj2 = new ExerciseTwo();

        obj.aFloat = 3.9f;
        obj2.aFloat = 9.5f;

        System.out.print("1: obj.afloat: " + obj.aFloat);
            obj = obj2;

        System.out.println("2: obj.aFloat: " + obj.aFloat + ", obj2.aFloat: " + obj2.aFloat);
        obj.aFloat = 0.27f;


        System.out.println("3: obj.aFloat:: " + obj.aFloat + ", obj2.aFloat: " + obj2.aFloat);

    }
}

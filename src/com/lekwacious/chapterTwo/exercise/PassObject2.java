package com.lekwacious.chapterTwo.exercise;

public class PassObject2 {

        static void f(ExerciseThree y) {
            y.a = 2.71828f;
        }

        public static void main(String[] args) {
            ExerciseThree x = new ExerciseThree();
            x.a = 3.1416f;
            System.out.println("1: x.a = " + x.a);
            f(x);
            System.out.println("2: x.a = " + x.a);
        }
}

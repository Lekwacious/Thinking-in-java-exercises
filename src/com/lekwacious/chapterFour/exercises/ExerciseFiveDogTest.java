package com.lekwacious.chapterFour.exercises;

public class ExerciseFiveDogTest {
    public static void main(String[] args) {
        ExerciseFiveDog obj = new ExerciseFiveDog();
        char c = 'c';
        byte b = 0;
        short s = 0;
        obj.bark();
        obj.bark((char)c);
        obj.bark((byte)b);
        obj.bark((short)s);
        obj.bark(1);
        obj.bark(1L);
        obj.bark(1.0f);
        obj.bark(1.0);
    }


}

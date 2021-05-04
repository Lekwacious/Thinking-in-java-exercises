package com.lekwacious.chapterFour.exercises;

public class ExerciseSixDogTest {
    public static void main(String[] args) {
        ExerciseFiveDog obj = new ExerciseFiveDog();
        char c = 'c';
        int a = 1;
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
        obj.bark(c);
        obj.bark(c, (char) 1);
        obj.bark(1, c);
    }

}

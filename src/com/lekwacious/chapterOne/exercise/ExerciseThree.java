package com.lekwacious.chapterOne.exercise;

public class ExerciseThree {
    public static void main(String[] args) {

        class ATypeName
        {
            int i;
            double d;
            boolean b;

           public void show() {
                System.out.println(i);
                System.out.println(d);
                System.out.println(b);
            }
        }
        ATypeName a = new ATypeName();
        a.i = 3;
        a.d = 2.71828;
        a.b = false;
        a.show();
    }
}

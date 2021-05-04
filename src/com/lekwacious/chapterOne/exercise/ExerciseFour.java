package com.lekwacious.chapterOne.exercise;

public class ExerciseFour {
    public static void main(String[] args)
    {
        class DataOnly
        {
            int i;
            double d;
            boolean b;
            void show()
            {
                System.out.println(i);
                System.out.println(d);
                System.out.println(b);
            }
        }
        DataOnly data = new DataOnly();
        data.i = 9;
        data.d = 25.718;
        data.b = true;
        data.show();
    }
}

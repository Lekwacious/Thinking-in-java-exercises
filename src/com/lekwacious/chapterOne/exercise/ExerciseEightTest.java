package com.lekwacious.chapterOne.exercise;

public class ExerciseEightTest {
    public static void main(String[] args) {


        System.out.println("Output of the static variable when called with the class name");
        System.out.println(ExerciseEight.name);
        System.out.println(ExerciseEight.number);
        System.out.println(ExerciseEight.accountBalance);


        ExerciseEight object1 = new ExerciseEight();

        ExerciseEight object2 = new ExerciseEight();

        System.out.println("Output of the static variable when called with the object 1");

        System.out.println(object1.name);
        System.out.println(object1.number);
        System.out.println(object1.accountBalance);

        System.out.println("Output of the static variable when called with the object 2");

        System.out.println(object2.name);
        System.out.println(object2.number);
        System.out.println(object2.accountBalance);

        ExerciseEight.changeValue();

        System.out.println("Output of the static variable of object1 after changing the value through the changeValue Method");
        System.out.println(object1.name);
        System.out.println(object1.number);
        System.out.println(object1.accountBalance);

        System.out.println("Output of the static variable of object2 after changing the value through the changeValue Method");
        System.out.println(object2.name);
        System.out.println(object2.number);
        System.out.println(object2.accountBalance);


    }


}

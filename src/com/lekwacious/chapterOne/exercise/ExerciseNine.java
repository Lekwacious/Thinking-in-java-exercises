package com.lekwacious.chapterOne.exercise;

public class ExerciseNine {
    //Autoboxing
    public static void main(String[] args) {

        boolean booleanPrimitive = false;
        char chaPrimitive = 'c';
        byte bytePrimitive = 4;
        short shortPrimitive = 17;
        int intPrimitive = 32;
        long longPrimitive = 649;
        float floatPrimitive = 0.32f;
        double doublePrimitive = 50.64;
        Boolean booleanWrapperClass = booleanPrimitive;
        System.out.println("booleanPrimitive booleanPrimitive = " + booleanPrimitive);
        System.out.println("booleanWrapperClass booleanWrapperClass = " + booleanWrapperClass);

        Character charWrapperClass = chaPrimitive;
        System.out.println("char chaPrimitive = " + chaPrimitive);
        System.out.println("Character charWrapperClass = " + charWrapperClass);

        Byte ByteWrapperClass = bytePrimitive;
        System.out.println("byte bytePrimitive = " + bytePrimitive);
        System.out.println("Byte ByteWrapperClass = " + ByteWrapperClass);


        Short ShortWrapperClass = shortPrimitive;
        System.out.println("short shortPrimitive = " + shortPrimitive);
        System.out.println("Short ShortWrapperClass = " + ShortWrapperClass);


        Integer integerWrapperClass = intPrimitive;
        System.out.println("int intPrimitive = " + intPrimitive);
        System.out.println("Integer integerWrapperClass = " + integerWrapperClass);

        Long longWrapperClass = longPrimitive;
        System.out.println("long longPrimitive = " + longPrimitive);
        System.out.println("Long longWrapperClass = " + longWrapperClass);

        Float floatWrapperClass = floatPrimitive;
        System.out.println("float floatPrimitive = " + floatPrimitive);
        System.out.println("Float floatWrapperClass = " + floatWrapperClass);


        Double doubleWrapperClass = doublePrimitive;
        System.out.println("double doublePrimitive = " + doublePrimitive);
        System.out.println("Double doubleWrapperClass = " + doubleWrapperClass);

    }
}

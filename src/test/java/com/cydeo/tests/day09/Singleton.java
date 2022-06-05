package com.cydeo.tests.day09;

public class Singleton {

    //create private instructor

    private Singleton(){}

    //create private static String
    //prevent access and provide a getter method

    private static String word;

    public static String getWord() {
        if (word == null){
            System.out.println("First time call. Word object is null. " + "Assigning valu to it now!");
            word = "something";
        }
        else {
            System.out.println(" Word has already a value.");
        }
        return word;
    }
}

package com.FirstJavaSteps;

public class Main {

    public static void main(String[] args) {
	    String message = "Hello World" + "!!";
        System.out.println(message);
        // strings are used as variables often so a shorthand version was made
        // concat or join with + operator

        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("W"));

        System.out.println(message.replace("!!", "$$"));
        // strings literals are immutable(cannot change) in Java
        // Any method that modify a string will always return a new string object
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
    }
}

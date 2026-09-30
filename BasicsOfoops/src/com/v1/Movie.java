package com.v1;

public class Movie {

    // Static variables
    static String movieName = "RRR";
    static int budget = 202;
    static int exp = 50;

    // Instance variable
    int rem = budget - exp;

    // Method with local variables
    public static void collection() {

        String movie = "RRR";
        String movieBudget = "345";

        // Printing everything in one line
        System.out.println(movieName + " " + budget + " " + movie + " " + movieBudget);
    }

    public static void main(String[] args) {

        // Calling static method
        collection();

        // Creating object to access non-static variable
        Movie m = new Movie();

        System.out.println("Remaining Budget: " + m.rem);
    }
}
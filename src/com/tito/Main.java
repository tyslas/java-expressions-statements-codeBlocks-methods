package com.tito;

public class Main {

    public static void main(String[] args) {

        // ml = 1.609344km
        double km = (100 * 1.609334);
        int highScore = 50;

        if (highScore == 50) {
            System.out.println("this is an expression");
        }



        //CHALLENGE:
        //in the code below identify which parts are expressions
        //semi-colons and data types are not included

        int score = 100; // line 20 expression: (score = 100)
        // line 22 expression: score > 99
        if (score > 99) {
            System.out.println("you got the high score!"); // line 23 expression: "you got the high score!"
            score = 0; // line 24  expression: score = 0
        }
    }
}

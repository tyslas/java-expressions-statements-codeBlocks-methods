package com.tito;

public class Main {

    public static void main(String[] args) {
    // KEYWORDS & EXPRESSIONS
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

    // STATEMENTS & WHITESPACE
        int myVariable = 50; //lines 27-30 are statements
        myVariable ++;
        myVariable --;
        System.out.println("this is a test ");

        System.out.println("this is" +
            " another" +
            " still more");
        //the compiler ignores white space
        int anotherVariable = 50; myVariable --; System.out.println("anutha one!"); //you can many statement on the same line

        // indenting helps us to see the logical flow (IntelliJ: ⌥ + ⌘ + L to reformat)

        /*IF STATEMENTS & CODE BLOCKS*/
        boolean gameOver = true;
        int newScore = 950;
        int levelCompleted = 5;
        int bonus = 100;

//        if (newScore < 5000 && newScore > 1000) {
//            System.out.println("1000 < score < 5000 "); //can write this if statement w/o curly braces
//        } else if (newScore < 1000) {
//            System.out.println("your score < 1000");
//        }
//        else {
//            System.out.println("got here");
//        }

        if (gameOver == true) {
            int finalScore = newScore + (levelCompleted * bonus);
            System.out.println("your final score is: " + finalScore);
        }
//        variables created inside of code blocks are not scoped globally, they are scoped to that block
//        int savedFinalScore = finalScore;

        /* CHALLENGE */
        // Print a second score to the screen w/the following params
        // 1. score set to 10_000
        // 2. levelCompleted set to 8
        // 3. bonus set to 200
        // 4. still print line 57
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("your second final score is: " + finalScore);
        }
    }
}

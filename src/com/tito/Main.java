package com.tito;

public class Main {

    public static void main(String[] args) {
    /* KEYWORDS & EXPRESSIONS */
        // ml = 1.609344km
        double km = (100 * 1.609334);
        int highScore = 50;

        if (highScore == 50) {
            System.out.println("this is an expression");
        }

    /* CHALLENGE: */
        //in the code below identify which parts are expressions
        //semi-colons and data types are not included

        int score = 100; // line 20 expression: (score = 100)
        // line 22 expression: score > 99
        if (score > 99) {
            System.out.println("you got the high score!"); // line 23 expression: "you got the high score!"
            score = 0; // line 24  expression: score = 0
        }

    /* STATEMENTS & WHITESPACE */
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
        int newScore = 800;
        int levelCompleted = 5;
        int bonus = 100;
        calculateScore(gameOver, newScore, levelCompleted, bonus); //uses method from line 65

        gameOver = false;
        newScore = 10000;
        levelCompleted = 8;
        bonus = 200;
        System.out.println(calculateScore(gameOver, newScore, levelCompleted, bonus));

//        variables created inside of code blocks are not scoped globally, they are scoped to that block
//        int savedFinalScore = finalScore;

    /* CHALLENGE */
        // Print a second score to the screen w/the following params
        // 1. score set to 10_000
        // 2. levelCompleted set to 8
        // 3. bonus set to 200
        // 4. still print line 57 **edited to use a method
//        boolean gameEnded = true;
//        int newScore = 10000;
//        int level= 8;
//        int newBonus = 200;
//
//        if (gameEnded) {
//            int finalScore = newScore + (level * newBonus);
//            System.out.println("[CHALLENGE] your second final score is: " + finalScore);
//        }
    }
    /* METHODS */
    // calculateScore method below
    // void keyword -> don't send any value back

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("[calculateScore method] your final score is: " + finalScore);
            return finalScore;
        }
        return -1;
        
    }
}

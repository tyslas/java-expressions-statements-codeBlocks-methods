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
        int playerScore = calculateScore(gameOver, newScore, levelCompleted, bonus); //uses method from line 65
        System.out.println("Your final score is: " + highScore);

        gameOver = false;
        newScore = 10000;
        levelCompleted = 8;
        bonus = 200;
        playerScore = calculateScore(gameOver, newScore, levelCompleted, bonus);
        System.out.println("your final score is: " + highScore);

//        variables created inside of code blocks are not scoped globally, they are scoped to that block
//        int savedFinalScore = finalScore;

    /* CHALLENGE: IF STATEMENTS & CODE BLOCKS */
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
    /* CHALLENGE: METHODS */
        // 1. Create a method called displayHighScorePosition
        // 2. it should have a players name as a parameter, and a 2nd parameter as a position in the high score table
        // 3. print: playerName + " managed to get into position " + position + " on the high score table".
        // **procedure -> method that returns type void
        // **methods can also be referred to as functions
        //
        // 4. Create a 2nd method called calculateHighScorePosition
        // 5. it should be sent one argument only, the player score
        // 6. it should return an int
        // 7. the return data should be:
            // 1 if the score is >= 1000
            // 2 if the score is >= 500 and < 1000
            // 3 if the score is >= 100 and < 500
            // 4 in all other cases
        // call both methods and display the results of the following
        // a score of 1500, 900, 400 and 50
        int player1 = 400;
//        String player1Name = "player1";
        int position = calculateHighScorePosition(player1);
        displayHighScorePosition("Percy", position);

        int player2 = 900;
        String player2Name = "player2";
//        position = calculateHighScorePosition(player2);
        displayHighScorePosition(player2Name, calculateHighScorePosition(player2));

        int player3 = 1500;
        String player3Name = "player3";
        position = calculateHighScorePosition(player3);
        displayHighScorePosition(player3Name, position);

        int player4 = 50;
        String player4Name = "player4";
        position = calculateHighScorePosition(player4);
        displayHighScorePosition(player4Name, position);
    }
    /* METHODS */
    // calculateScore method below
    // void keyword -> don't send any value back

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        if (gameOver) {
          int finalScore = score + (levelCompleted * bonus);
//          System.out.println("[calculateScore method] your final score is: " + finalScore);
          return finalScore;
        }
        return -1;

    }

    public static void displayHighScorePosition(String playerName, int position) {
      System.out.println(playerName + " managed to get into position "
          + position + " on the high score table");
    }

    public static int calculateHighScorePosition(int gamerScore) {
        if (gamerScore >= 1000) {
          return 1;
        } else if (gamerScore < 1000 && gamerScore >= 500) {
          return 2;
        } else if (gamerScore < 500 && gamerScore >= 100) {
          return 3;
        } else {
          return 4;
        }
    }
}

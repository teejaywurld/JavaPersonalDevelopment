package com.teejaywurld.main.JavaBasics;

public class ExpressionsStatementsCodeBlocksMethods {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final score was " + highScore);

        System.out.println();


        //          TODO:- Challenge 1
//      1)  Create a method called displayHighScorePosition
//      2)  It should be a player's name as a parameter and a 2nd parameter in the high score table
//      3)  You should display the player's name along with a message like "managed to get into position" and the position they got and a further message "on the high score table".

//      4)  Create a second method called calculateHighScorePosition
//      5)  It should be sent one argument only, the player's score
//      6)  It should return an int
//      7)  The return data should be
//          a)  if the score is > 1000
//          b)  if the score is > 500 and < 1000
//          c)  if the score is > 100 and < 500
//          d)  in all other cases
//          e)  call both methods and display the result of the following
//          f)  a score of 1500, 900, 400 and 50

//              TODO:- Solution to Challenge 1
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Messi", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Frank", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Ronaldo", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Peter", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Neymar", highScorePosition);

        highScorePosition = calculateHighScorePosition(200);
        displayHighScorePosition("Lampard", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Kelechi", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Suarez", highScorePosition);


//          TODO:- Challenge 2
//        Write a method called checkNumber with an int parameter number.
//        The number should not return any value and it needs to print out:
//        * "positive" if the parameter number is > 0;
//        * "negative" if the parameter number is < 0;
//        * "zero" if the parameter number is equal to 0;
//        NOTE:- The checkNumber method needs to be defined as public static without a main method in the code.

//          TODO:- Solution to Challenge 2
        checkNumber(5);
    }
        public static void displayHighScorePosition(String playersName, int highScorePosition) {
            System.out.println(playersName + " managed to get into the number " + highScorePosition + " position on the high score table.");
        }
        public static int calculateHighScorePosition(int playersScore){
            if (playersScore >= 1000){
                return 1;
            } else if (playersScore >= 500){
                return 2;
            } else if (playersScore >= 100){
                return 3;
            } else {
                return 4;
            }
        }
        public static void checkNumber(int number) {
            if (number > 0) {
                System.out.println("Your number is positive");
            } else if (number < 0) {
                System.out.println("Your number is negative");
            } else {
                System.out.println("Your number is zero");
            }
        }
    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            return finalScore;
        }
        return -1;
    }
}

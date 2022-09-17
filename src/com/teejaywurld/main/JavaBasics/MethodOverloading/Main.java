package com.teejaywurld.main.JavaBasics.MethodOverloading;

//  Method Overloading in Java is when the same method name is being used but with different parameters.
//  It improves code readability and re-usability.

public class Main {
    public static void main(String[] args) {
        int newScore = calculateScore("Teejay", 500);
        System.out.println("New Score is " + newScore);
        calculateScore(90);

        System.out.println();

    }
        public static int calculateScore (String playerName,int score){
            System.out.println("Player " + playerName + " scored " + score + " points.");
            return score * 1000;
        }

        public static int calculateScore ( int score){
            System.out.println("Unnamed player scored " + score + " points.");
            return score * 1000;
        }

        public static int calculateScore () {
            System.out.println("Since we have no player name, there is no player score");
            return 0;
        }
    }

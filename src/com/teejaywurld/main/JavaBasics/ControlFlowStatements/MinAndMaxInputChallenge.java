package com.teejaywurld.main.JavaBasics.ControlFlowStatements;

//  Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered;
//  Before the user enters the number, print the message "Enter number";
//  If the user enters an invalid number, break out of the loop and print the minimum and maximum number;
//  HINT:
//      ** use an endless while loop;
//  BONUS:
//      ** Create a project with the name MinAndMaxInputChallenge

import java.util.Scanner;

public class MinAndMaxInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        int min = Integer.MAX_VALUE;
//        int max = Integer.MIN_VALUE;

        int max = 0;
        int min = 0;
        boolean first = true; //comment out to use the method in lines 17 & 18

        while (true) {
            System.out.println("Enter number: ");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt){
                int number = scanner.nextInt();
                if (first){ // Comment out lines 31 - 35 to use the method in lines 17 & 18;
                    first = false;
                    min = number;
                    max = number;
                }

                if (number > max){
                    max = number;
                }
                if (number < min){
                    min = number;
                }
            } else {
                break;
            }
            scanner.nextLine(); // handle input;
        }
        System.out.println("Min = " + min + ", Max = " + max);
        scanner.close();
    }
}
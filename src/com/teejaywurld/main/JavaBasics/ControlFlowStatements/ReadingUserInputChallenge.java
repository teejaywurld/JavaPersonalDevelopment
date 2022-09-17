package com.teejaywurld.main.JavaBasics.ControlFlowStatements;

//  Read 10 numbers from the console entered by the user and print the sum of those numbers;
//  Create a Scanner method like has been done in the previous examples;
//  Use the hasNextInt() method from the scanner to check if the user has entered an int value;
//  If hasNextInt() returns false, print the message "Invalid Number". Continue reading until you have read 10 numbers;
//  Use the nextInt() method to get the number and add it to the sum;
//  Before the user enters each number, print the message "Enter number #x." where x represents the count i.e. 1, 2, 3, 4, e.t.c.
//  For example, the first message printed to the user would be "Enter number #1:", the next "Enter number #2:", and so on;
//  HINT:
//      ** Use a while loop;
//      ** Use a counter variable for counting valid numbers;
//      ** Close the scanner after you don't need it anymore;
//      ** Create a project with the name ReadingUserInputChallenge;

import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter your first number here: ");
//
//        boolean hasNextInt = scanner.hasNextInt();
//
//        if (hasNextInt) {
//            int firstNumber = scanner.nextInt();
//
//            System.out.println("Enter your second number here: ");
//            int secondNumber = scanner.nextInt();
//
//            System.out.println("Enter your third number here: ");
//            int thirdNumber = scanner.nextInt();
//
//            System.out.println("Enter your fourth number ere: ");
//            int fourthNumber = scanner.nextInt();
//
//            System.out.println("Enter your fifth number here: ");
//            int fifthNumber = scanner.nextInt();
//
//            System.out.println("Enter your sixth number here: ");
//            int sixthNumber = scanner.nextInt();
//
//            System.out.println("Enter your seventh number here: ");
//            int seventhNumber = scanner.nextInt();
//
//            System.out.println("Enter your eight number here: ");
//            int eightNumber = scanner.nextInt();
//
//            System.out.println("Enter your ninth number here: ");
//            int ninthNumber = scanner.nextInt();
//
//            System.out.println("Enter your tenth number here: ");
//            int tenthNumber = scanner.nextInt();
//
//            int sum = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber + sixthNumber +
//                    seventhNumber + eightNumber + ninthNumber + tenthNumber;
//
//                System.out.println("The sum of the numbers you entered = " + sum);
//        } else {
//            System.out.println("Invalid number entered!");
//        }

        int counter = 0;
        int sum = 0;

        while (true){
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt){
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if (counter == 10){
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine(); // handle end of line (enter key);
        }

        System.out.println("Sum = " + sum);
        scanner.close();
    }
}

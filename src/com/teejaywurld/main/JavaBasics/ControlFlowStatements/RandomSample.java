package com.teejaywurld.main.JavaBasics.ControlFlowStatements;

import java.util.Scanner;

public class RandomSample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (true){
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int entry = scanner.nextInt();
                counter++;
                sum += entry;
                if (counter == 2) {
                    break;
                }
            }
                else {
                    System.out.println("Invalid number entered, input the right one");
                }
                scanner.nextLine();
            }
            System.out.println("Sum = " + sum);
            scanner.close();
        }
    }

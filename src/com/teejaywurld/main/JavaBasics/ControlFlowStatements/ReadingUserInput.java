package com.teejaywurld.main.JavaBasics.ControlFlowStatements;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth here: ");

        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine(); // handle next line character (enter key);

            System.out.println("Enter your home address here: ");
            String homeAddress = scanner.nextLine();
            scanner.nextLine();

            System.out.println("Enter your phone number here: ");
            String phoneNumber = scanner.nextLine();
            scanner.nextLine();

            System.out.println("Kindly enter your name here: ");
            String name = scanner.nextLine();

            int age = 2022 - yearOfBirth;
            if (age >= 0 && age <= 200) {
                System.out.println("Your name is: " + name + ", you are " + age + " years old," + " your home address " +
                        "is: '" + homeAddress + "' and your phone number is: " + phoneNumber);
            } else {
                System.out.println("Invalid year of birth entered");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }

        scanner.close();
    }
}

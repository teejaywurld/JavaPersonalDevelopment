package com.teejaywurld.main.JavaBasics.Exceptions;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        try {
            int result = divide();
            System.out.println(result);
        } catch (ArithmeticException | NoSuchElementException e){
            System.out.println(e.toString());
            System.out.println("Unable to perform division, autopilot shutting down! **wink** **thumbs up** ");
        }
    }

    private static int divide() {
        int x, y;
//        try {
            x = getInt();
            y = getInt();
            System.out.println("x is " + x + ", y is " + y);
            return x / y;
//        } catch (NoSuchElementException e){
//            throw new NoSuchElementException("not a suitable input");
//        } catch (ArithmeticException e){
//            throw new ArithmeticException("attempt to divide by zero");
//        }
    }

    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer: ");
        while (true){
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e){
                // go round again. Read past the end of line in the input first
                scanner.nextLine();
                System.out.println("Please enter only digits between 0 to 9");
            }
        }
    }
}

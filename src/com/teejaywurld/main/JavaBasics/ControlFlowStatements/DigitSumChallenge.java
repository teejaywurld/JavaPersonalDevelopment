package com.teejaywurld.main.JavaBasics.ControlFlowStatements;

//          TODO:- Challenge 1
//  Write a method with the name "sumDigits" that has one int parameter called number.
//  If the parameter is >= 10 then the method should process the number and return sum of all digits, otherwise,
//  return -1 to indicate an invalid value.
//  The numbers from 0-9 have 1 digit so we don't want to process them, also we don't want to process negative numbers, so also return -1 for negative numbers.
//  For example, calling the method sumDigits(125) should return 8 since 1+2+5=8
//  Calling the method sumDigits(1) should return -1 as per requirements described above.
//  Add some code to the main method to test out the sumDigits method to determine that it is working correctly for valid and invalid values passed as arguments.
//  HINT:-
//      ** Use n % 10 to extract the least-significant digit
//      ** Use n = n / 10 to discard the least-significant digit
//      ** The method needs to be static like other methods you've used
//      ** Create a project with the name DigitSumChallenge


//          TODO:- Solution To challenge 1

public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println("Sum of digits in number 125 is " + sumDigits(125));
        System.out.println("Sum of digits in number -125 is " + sumDigits(-125));
        System.out.println("Sum of digits in number 4 is " + sumDigits(4));
        System.out.println("Sum of digits in number 32123 is " + sumDigits(32123));
        System.out.println("Sum of digits in number 1 is " + sumDigits(1));
    }

    public static int sumDigits(int number){
        if (number < 10){
            return -1;
        }

        int sum = 0;
//        125 ==> 125 / 10 => 12 -- 12 * 10 => 120 -- 125 - 120 = 5;w
        while (number > 0){
//            extract the least significant digit
            int digit = number % 10;
            sum += digit;
//            drop the least significant digit
            number /= 10;
        }
        return sum;
    }
}


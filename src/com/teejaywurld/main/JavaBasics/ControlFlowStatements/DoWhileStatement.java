package com.teejaywurld.main.JavaBasics.ControlFlowStatements;

public class DoWhileStatement {
    public static void main(String[] args) {
        int count = 0;
        while (count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

        System.out.println();
        System.out.println("***********************");
        System.out.println();

        for (count = 0; count != 5; count++) {
            System.out.println("Count value is " + count);
        }

        System.out.println();
        System.out.println("***********************");
        System.out.println();

        count = 0;
        while (true) {
            if (count == 5) {
                break;
            }
            System.out.println("Count value = " + count);
            count++;
        }

        System.out.println();
        System.out.println("***********************");
        System.out.println();

        count = 0;
        do {
            System.out.println("Count value = " + count);
            count++;
        } while (count != 5);

        System.out.println();
        System.out.println("***********************");
        System.out.println();

        int number = 4;
        int finishedNumber = 20;

        while (number <= finishedNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " + number);
        }

        System.out.println();
        System.out.println("***********************");
        System.out.println();

        int numbers = 4;
        int finishedNumbers = 20;
        int evenNumbersFound = 0;

        while (numbers <= finishedNumbers) {
            numbers++;
            if (!isEvenNumber(numbers)) {
                continue;
            }

            System.out.println("Even number " + numbers);

            evenNumbersFound++;
            if (evenNumbersFound >= 5){
                break;
            }

        }

        System.out.println("Total even numbers found = " + evenNumbersFound);

        System.out.println();
        System.out.println("***********************");
        System.out.println();
    }


//          TODO:- Challenge 1
//    Create a method called isEvenNumber that takes a parameter of type int
//    Its purpose is to determine if the argument passed to the method is
//    an even number or not
//    return true if an even number, otherwise, return false.
//
//    Modify the while code above
//    Make it also record the total number of even numbers it has found
//    and break once 5 numbers are found
//    and at the end, display the total number of even numbers found

//          TODO:- Solution To Challenge 1
    public static boolean isEvenNumber(int number){
        if (number % 2 == 0){
            return true;
        } else {
            return false;
        }
    }
}


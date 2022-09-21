package com.teejaywurld.main.JavaBasics.Arrays;

//  Create a program using arrays that sorts a list of integers in descending order;
//  Descending order is the highest value to lowest;
//  In other words, if the array had the values in it 106, 26, 81, 5 and 15, your program should ultimately have an array with 106, 81, 26, 15 and 5 in it;
//  Set up the program so that the numbers to sort are read in from the keyboard;
//  Implement the following methods:- getIntegers, printArray and sortIntegers;
//  getIntegers returns an array of entered integers from keyboard;
//  printArray prints out the contents of the array;
//  and sortIntegers should sort the array and return a new array containing the sorted numbers;
//  you will have to figure out how to copy the array elements from the passed array into a new array and sort them and return the new sorted array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArrays = getIntegers(5);
        int[] sorted = sortIntegers(myArrays);
        printArrays(sorted);
        }

    private static int[] getIntegers(int numbers) {
        int[] numberValues = new int[numbers];
        System.out.println("Enter " + numbers + " integer values\r");

        for (int i = 0; i < numberValues.length; i++) {
            numberValues[i] = scanner.nextInt();
        }
        return numberValues;
    }

    private static void printArrays(int[] arrays){
        for (int i = 0; i < arrays.length; i++) {
            System.out.println("Element " + i + " value is " + arrays[i]);
        }
    }

    private static int[] sortIntegers(int[] number){
//        int[] entries = new int[number.length];
//        for (int i = 0; i < number.length; i++) {
//            entries[i] = number[i];
//        }
        // another method to copy an array to sort it is the next line below
        int[] entries = Arrays.copyOf(number, number.length);

        boolean flag = true;
        int temp;
        while (flag){
            flag = false;
            for (int i = 0; i < entries.length - 1; i++) {
                if (entries[i] < entries[i+1]){
                    temp = entries[i];
                    entries[i] = entries[i+1];
                    entries[i+1] = temp;
                    flag = true;
                }
            }
        }
        return entries;
    }
}

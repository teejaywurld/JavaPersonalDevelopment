package com.teejaywurld.main.JavaBasics.Arrays;

//  Write a method called readIntegers() with a parameter called count that represents how many integers the user needs to enter;
//  The method needs to read from the console until all the numbers are entered and then return an array containing the numbers entered;
//  Write a method findMin() with the array as a parameter. The method needs to return the minimum value in the array;
//  In the main() method, read the count from the console and call the method readIntegers() with the count as the parameter;
//  Then call the findMin() passing the array returned from the call to the readIntegers() method;
//  Finally, print the minimum element in the array;
//  TIPs:-
//      ** Assume that the user will only enter numbers, never letters;
//      For simplicity, create a Scanner as a static field to help with data input;
//      Create a new console project with the name "MinimumElementChallenge"

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElementChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myArrays = readIntegers(5);
        System.out.println("An array of numbers entered = " + Arrays.toString(myArrays));
        findMin(myArrays);
    }

    private static int[] readIntegers(int count){
        int[] numberValues = new int[count];
        System.out.println("Enter " + count + " integer values\r");

        for (int i = 0; i < numberValues.length; i++) {
            numberValues[i] = scanner.nextInt();
        }
        return numberValues;
    }

    private static int[] findMin(int[] array){
        int min, size;
        int numArr[] = new int[5];
        System.out.println("Enter array size : ");
        size = scanner.nextInt();
        System.out.println("Enter array elements : ");
        for (int i = 0; i < size; i++) {
            numArr[i] = scanner.nextInt();
        }
            System.out.println("Searching for the smallest element...\n");
            min = numArr[0];
            for (int i = 0; i < size; i++) {
                if (min > numArr[i]){
                    min = numArr[i];
                }
            }
            System.out.println("Minimum Element = " + min);
            return numArr;
        }
    }

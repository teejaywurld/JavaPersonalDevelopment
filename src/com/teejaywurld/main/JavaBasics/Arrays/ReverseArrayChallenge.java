package com.teejaywurld.main.JavaBasics.Arrays;

//  Write a method called reverse() with an int array as a parameter;
//  The method should not return any value. In other words, the method is allowed to modify the array parameter;
//  In main(), test the reverse() method and print the array both reversed and non-reversed;
//  To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and
//  so on;
//  For example, if the array is {1,2,3,4,5}, then the reversed array is {5,4,3,2,1);
//  Tip:
//      ** Create a new console project with the name "ReverseArrayChallenge";

import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayChallenge {
    public static void main(String[] args) {
        int[] reversedArray = {10, 20, 30, 40, 50};
        System.out.println("Printed array = " + Arrays.toString(reversedArray));
        reverse(reversedArray, reversedArray.length);
        Integer [] arrays = {10, 20, 30, 40, 50};
        reverse(arrays);

        System.out.println();

        int[] array = {1, 5, 3, 7, 11, 9, 15};
        System.out.println("Array = " + Arrays.toString(array));

        reverse(array);

        System.out.println("Reversed array = " + Arrays.toString(array));
    }

    private static void reverse(int[] array, int number) {
        int[] entryNumber = new int[number];
        int j = number;
        for (int i = 0; i < number; i++) {
            entryNumber[j - 1] = array[i];
            j = j - 1;
        }
        System.out.println("Reversed array is: ");
        for (int k = 0; k < number; k++) {
            System.out.println(entryNumber[k]);
        }
    }

    private static void reverse(Integer[] a){
        Collections.reverse(Arrays.asList(a));
        System.out.println("Reversed array = " + Arrays.asList(a));
    }

    private static void reverse(int[] array){
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;
        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}

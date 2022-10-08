package com.teejaywurld.main.JavaBasics.AutoboxingAndUnboxing;

import java.util.ArrayList;

public class SampleSolution {
    public static void main(String[] args) {

        ArrayList<Integer> intArrayList = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            intArrayList.add(Integer.valueOf(i));
        }
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());
        }
    }
}

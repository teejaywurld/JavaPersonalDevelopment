package com.teejaywurld.main.JavaBasics.SpeedConverter;

public class Main {
    public static void main(String[] args) {
        long miles = SpeedConverter.toMilesPerHour(20.5);
        System.out.println("Miles = " + miles);

        SpeedConverter.printConversion(10.5);
    }
}

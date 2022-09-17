package com.teejaywurld.main.JavaBasics.ControlFlowStatements;

// Parsing values from a String means converting a String into some other data type such as a "String value" into an "int" when reading an input from a user either after it has been entered into the console or been retrieved from a user interface.

public class ParsingValuesFromAString {
    public static void main(String[] args) {
        String numberAsString = "2022";
        System.out.println("numberAsString = " + numberAsString);

        int number = Integer.parseInt(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1;

        System.out.println("number as a string = " + numberAsString);
        System.out.println("number = " + number);
    }

}

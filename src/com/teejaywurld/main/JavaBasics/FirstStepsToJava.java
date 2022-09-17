package com.teejaywurld.main.JavaBasics;

public class FirstStepsToJava {
    public static void main(String[] args) {
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        System.out.println();

        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Max Value = " + (myMaxIntValue + 1));
        System.out.println("Busted Min Value = " + (myMinIntValue - 1));

        int myMaxInTest = 2_147_483_647;

        int myMaxByteValue = Byte.MIN_VALUE;
        int myMinByteValue = Byte.MAX_VALUE;

        System.out.println();

        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        System.out.println();

        int myMaxShortValue = Short.MIN_VALUE;
        int myMinShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        System.out.println();

        long myLongValue = 100L;
        long myMaxLongValue = Long.MIN_VALUE;
        long myMinLongValue = Long.MAX_VALUE;

        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        System.out.println();

        short bigShortLiteralValue = 32767;
        System.out.println(bigShortLiteralValue);

        int myTotal = (myMinIntValue / 2);
        System.out.println(myTotal);

        byte myNewByteValue = (byte) (myMaxByteValue / 2);
        System.out.println(myNewByteValue);

        short myNewShortValue = (short) (myMaxShortValue / 2);
        System.out.println(myNewShortValue);

        byte firstNumber = 3;
        short secondNumber = 8;
        int thirdNumber = 6;
        long fourthNumber = 50000L;

        System.out.println("The total summation is = " + (fourthNumber + 10 * (firstNumber + secondNumber + thirdNumber)));

        System.out.println();

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;

        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);

        System.out.println();

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;

        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        System.out.println();


//        TODO: Challenge 1
//      Convert a given number of pounds to kilograms.

//        STEPS:
//      1. Create a variable with the appropriate type to store the number of pounds to be converted to kilograms.
//      2. Calculate the result i.e. the number of kilograms based on the contents of the variable above and store the result in a second appropriate variable.
//      3.  Print out the result.

//      HINT: ! pounds is equal to 0.45359237 of a kilogram. This should help you perform the calculation

//        TODO: Challenge 1 Solution
        double poundsValue = 56.78;
        double kiloValue = poundsValue * 0.45359237;

        System.out.println(kiloValue);

        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        char myCopyrightChar = '\u00A9';
        System.out.println(myUnicodeChar);
        System.out.println(myCopyrightChar);

        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an Alien");

        System.out.println();



//        TODO: Challenge 2
//       1. Create a double variable with a value of 20.00;
//       2. Create a second variable of type double with the value 80.00;
//       3. Add both numbers together and multiply by 100.00;
//       4. Use the remainder operator to figure out what the remainder from the operation in step 3 and 40.00;
//       5. Create a boolean variable that assigns the value true if the remainder in #4 is 0, or false if its not zero;
//       6. Output the boolean variable
//       7. Write an if-then statement that displays a message "Got some remainder" if the boolean in step 5 iw not true.


//        TODO: Challenge 2 Solution
        double firstValue = 20.00;
        double secondValue = 80.00;
        double myValuesTotal = (firstValue + secondValue) * 100.00;
        System.out.println("The values total = " + myValuesTotal);

        System.out.println();

        double remainder = myValuesTotal % 40.00;
        System.out.println("The remainder is = " + remainder);
        boolean isNoRemainder = (remainder == 0) ? true : false;
        System.out.println("isNoRemainder is " + "" + isNoRemainder);

        if (!isNoRemainder){
            System.out.println("Got some remainder");
        }

    }
}

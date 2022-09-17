package com.teejaywurld.main.JavaBasics.MethodOverloading;

//              TODO:- Challenge 1
//        Create a method called "calcFeetAndInchesToCentimeters"
//        It needs to have two parameters
//        feet is the first parameter, inches is the second parameter
//
//        You should validate that the first parameter feet is >= 0
//        You should validate that the second parameter inches is > 0 and <= 12
//        return -1 from the method if either of the above is not true
//
//        If the parameters are valid, then calculate how many centimetres
//        Compromise the feet and inches passed to this method and return that value
//
//        Create a second method of the same name but with only one parameter
//        inches is the parameter
//        validate that its >= 0
//        return -1 if it is not true
//        But if its valid, then calculate how many feet are in the inches
//        and then here is the tricky part
//        call the other overloaded method passing the correct feet and inches
//        calculate so that it can calculate correctly
//        hints: Using double for your number data-types is probably a good idea
//        1 inch = 2.54cm and one foot = 12inches
//        ** Calling another overloaded method just requires using the number of parameters.


//              TODO:- Challenge 1 Solution
public class FeetAndInchesConversion {
    public static void main(String[] args) {

        double centimeters = calcFeetAndInchesToCentimeters(8, 3);
        if (centimeters < 0.0) {
            System.out.println("invalid parameters");
        }

        calcFeetAndInchesToCentimeters(156);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet < 0) || ((inches < 0) || (inches > 12))){
            System.out.println("Invalid feet and inches parameters entered");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + "cm");
        return centimeters;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0){
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }
}

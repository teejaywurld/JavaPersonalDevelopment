package com.teejaywurld.main.JavaBasics.MethodOverloading;

//              TODO:- Challenge 1
//        Create a method called "getDurationString" with two parameters, first parameter "minutes" and second parameter
//        "seconds"
//        You should validate that the first parameter minutes is >= 0
//        You should validate that the second parameter seconds is >= 0 and <= 59
//        The method should return "Invalid value" in the method if either of the above are not true
//        If the parameters are valid then calculate how many hours, minutes and seconds equal the minutes and seconds
//        passed to this method and return that value as string in format "XXh YYm ZZs" where XX represents a number of
//        hours, YY the minutes and ZZ the seconds
//
//        Create a second method of the same name but with only one parameter "seconds"
//        Validate that it is >= 0, and return "Invalid value" if it is not true
//        If it is valid, then calculate how many minutes are in the seconds value and then call the other overloaded
//        method passing the correct minutes and seconds calculated so that it can calculate correctly.
//        Call both methods to print values to the console.
//        TIPS:-
//          a)  Using int or long for your number data types is a good idea
//          b)  1 minute = 60 seconds and 1 hour = 60 minutes or 3600 seconds
//          c)  Methods should be static as have been used previously
//          d)  for the input 61 minutes, output should be 01h 01m 00s, but it is okay if it is 1h 1m 0s ----
//          (use if-else)
//          e)  Create a new console project and call it SecondsAndMinutesChallenge


//              TODO:- Challenge 1 Solution
public class SecondsAndMinutesChallenge {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        int hours = getDurationString(182, 58 );
//        System.out.println(getDurationString(82, 55));
        if (hours < 0){
            System.out.println(INVALID_VALUE_MESSAGE);
        }

        getDurationString(3600);

    }
    public static int getDurationString(int minutes, int seconds) {
        if ((minutes < 0) || ((seconds < 0) || (seconds > 59))) {
//            return "Invalid value";
            System.out.println(INVALID_VALUE_MESSAGE);
            return -1;
        }

//        int hours = minutes * seconds;
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        String hoursString = hours + "h";
        if (hours < 10){
            hoursString = "0" + hoursString;
        }

        String minutesString = remainingMinutes + "m";
        if (remainingMinutes < 10){
            minutesString = "0" + minutesString;
        }

        String secondsString = seconds + "s";
        if (seconds < 10){
            secondsString = "0" + secondsString;
        }

        System.out.println(hoursString + " " + minutesString + " " + secondsString + " ");
        return hours;
    }

    public static int getDurationString(int seconds){
        if (seconds < 0){
//            return "Invalid value";
            return -1;
        }

        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        System.out.println(seconds + "s is equal to " + minutes + "m");
        return getDurationString(minutes, remainingSeconds);
    }
}

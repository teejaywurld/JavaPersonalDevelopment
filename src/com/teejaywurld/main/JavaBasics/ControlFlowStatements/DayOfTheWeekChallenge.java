package com.teejaywurld.main.JavaBasics.ControlFlowStatements;

//      TODO:- Challenge 1
//  Write a method with the name "printDayOfTheWeek" that has one parameter of type int and name it day;
//  The method should not return any value (hint: void);
//  Using a switch statement, print "Sunday", "Monday", ..., "Saturday" if the int parameter "day" is "0, 1, ..., 6"
//  respectively, otherwise it should print "Invalid day".
//
//  Write a second solution using "if then else" instead of using switch statement.
//  Create a new project with the name "DayOfTheWeekChallenge"

public class DayOfTheWeekChallenge {
    private static final String ERROR_MESSAGE = "Invalid day";

    public static void main(String[] args) {
        printDayOfTheWeek(4);

        System.out.println();

        int weekDay = 0;

        if (weekDay == 0){
            System.out.println("Sunday");
        } else if (weekDay == 1){
            System.out.println("Monday");
        } else if (weekDay == 2){
            System.out.println("Tuesday");
        } else if (weekDay == 3){
            System.out.println("Wednesday");
        } else if (weekDay == 4){
            System.out.println("Thursday");
        } else if (weekDay == 5){
            System.out.println("Friday");
        } else if (weekDay == 6){
            System.out.println("Saturday");
        } else {
            System.out.println(ERROR_MESSAGE);
        }
    }
        public static void printDayOfTheWeek(int day){

            switch (day){
                case 0:
                    System.out.println("Sunday");
                    break;
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wednesday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                default:
                    System.out.println(ERROR_MESSAGE);
                    break;
            }
        }
    }

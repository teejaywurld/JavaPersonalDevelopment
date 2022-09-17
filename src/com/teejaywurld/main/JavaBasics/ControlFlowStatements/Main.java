package com.teejaywurld.main.JavaBasics.ControlFlowStatements;

public class Main {
    public static void main(String[] args) {
        int value= 2;
        if (value == 1){
            System.out.println("Value was 1");
        } else if (value == 2){
            System.out.println("Value was 2");
        } else {
            System.out.println("Value was neither 1 nor 2");
        }

        System.out.println();

        int switchValue = 1;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            default:
                System.out.println("Value was neither 1 nor 2");
                break;
        }

        System.out.println();

//          TODO:- Challenge 1
//        Create a new switch statement using char instead of int
//        Create a new char variable
//        Create a switch statement testing for A, B, C, D or E
//        Display a message if any of these are found and then break
//        Add a default which displays a message saying not found


//          TODO:- Solution To Challenge 1
        char switchTesting = 'A';

        switch (switchTesting) {
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(switchTesting + " was found");
                break;
            default:
                System.out.println("Could not find A, B, C, D or E");
                break;
        }

        System.out.println();

        String month = "October";

        switch (month.toLowerCase()){
            case "January":
                System.out.println("Jan");
                break;
            case "February":
                System.out.println("Feb");
                break;
            case "March":
                System.out.println("Mar");
                break;
            case "April":
                System.out.println("Apr");
                break;
            case "May":
                System.out.println("May");
                break;
            case "June":
                System.out.println("Jun");
                break;
            case "July":
                System.out.println("Jul");
                break;
            case "August":
                System.out.println("Aug");
                break;
            case "September":
                System.out.println("Sept");
                break;
            case "october":
                System.out.println("Oct");
                break;
            case "November":
                System.out.println("Nov");
                break;
            case "December":
                System.out.println("Dec");
                break;
            default:
                System.out.println("Month not found");
                break;
        }
    }
}

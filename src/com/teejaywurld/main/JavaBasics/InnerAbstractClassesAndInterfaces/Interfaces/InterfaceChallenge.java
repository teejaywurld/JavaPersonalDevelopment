package com.teejaywurld.main.JavaBasics.InnerAbstractClassesAndInterfaces.Interfaces;

//  Create a simple interface (tip: name it Savable or ISavable);
//  That interface allows an object to be saved to some sort of storage medium (tip: use ArrayList);
//  The exact type of medium is not known to the interface (nor to the classes that implements it);
//  The interface will just specify two methods, one to return an ArrayList of values to be saved;
//  and the other to populate the object's fields from an Arraylist (parameter);
//
//  Create a few sample classes that implements your Savable interface (we've used the idea of a game with Players and Monsters, but you can create any type of classes that you want);
//
//  Override the toString() method for each of your classes so that they can be easily printed to enable the program to be tested easier;
//
//  In Main, write a method that takes an object that implements the interface as a parameter and "saves" the values e.g. calls the method defined in the interface;
//
//  Your method should print the values to the screen; Also in the Main class, write a method that restores the values to a Savable object e.g. calls the method from the interface for populating fields (see above);
//
//  Use the readValues() method below to simulate getting values from a file - this allows you to type as many values as your class requires and returns an ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class InterfaceChallenge {
    public static void main(String[] args) {
        Player teejay = new Player("Teejay", 10, 15);
        System.out.println(teejay.toString());
        saveObject(teejay);

        teejay.setHitPoints(9);
        System.out.println(teejay);
        teejay.setWeapon("Shakabula");
        saveObject(teejay);
        loadObject(teejay);
        System.out.println(teejay);
    }

    public static ArrayList<String> readValues(){
       ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit){
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;

                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
    public static void saveObject(ISavable objectToSave){
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device...");
        }
    }

    public static void loadObject(ISavable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}

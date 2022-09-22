package com.teejaywurld.main.JavaBasics.Arrays;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> grocerylist = new ArrayList<String>();

    public void addGroceryItem(String item){
        grocerylist.add(item);
    }
    
    public void printGroceryList(){
        System.out.println("You have " + grocerylist.size() + " items in your grocery list");
        for (int i = 0; i < grocerylist.size(); i++) {
            System.out.println((i + 1) + ". " + grocerylist.get(i));
        }
    }
}

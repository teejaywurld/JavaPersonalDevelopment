package com.teejaywurld.main.JavaBasics.Arrays;

//  Create a program that implements a simple mobile phone with the following capabilities;
//  Able to store, modify, remove and query contact names;
//  You will want to create a separate class for Contacts (name&phone number);
//  Create a master class (MobilePhone) that holds the ArrayList of Contacts;
//  The MobilePhone class has the same functionality listed above;
//  Add a menu of options that are available;
//  Options:- Quit, print list of contacts, add new contact, update existing contact, remove contact and search/find contact;
//  When adding or updating, be sure to check if the contact already exists (use name);
//  Be sure not to expose the inner workings of the ArrayList to MobilePhone e.g. no ints, no .get(i), etc;
//  MobilePhone should do everything with Contact objects only;

public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name, phoneNumber);
    }
}

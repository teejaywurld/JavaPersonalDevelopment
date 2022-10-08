package com.teejaywurld.main.JavaBasics.AutoboxingAndUnboxing;

//  Your job is to create a simple banking application;
//  There should be a Bank Class; It should have an arraylist of branches;
//  Each Branch should have an arraylist od Customers;
//  The Customer class should have an arraylist of Doubles (transactions);
//  Customer;
//  Name and the ArrayList of doubles;
//  Branch;
//  Need to be able to add a new customer and initial transaction amount;
//  Also needs to add additional transactions for the customer/branch;
//  Bank;
//  Add a new branch;
//  Add a customer to that branch with initial transaction;
//  Add a transaction for an existing customer for that branch;
//  Show a list of customers for a particular branch and optionally a list of their transactions;
//  Demonstrate autoboxing and unboxing in your code;
//  Hint: Transactions;
//  Add data validation;
//  e.g. check if it exists or does not exist, e.t.c.;
//  Think about where you are adding the code to perform certain actions;

public class AutoboxingChallenge {
    public static void main(String[] args) {

        Bank bank = new Bank("Zenith Bank International");
        if(bank.addBranch("Asaba")){
            System.out.println("Asaba branch created");
        }

        bank.addCustomer("Asaba", "Adetunji", 55000.50);
        bank.addCustomer("Asaba", "Funmi", 185350.80);
        bank.addCustomer("Asaba", "Percy", 18025.18);

        bank.addBranch("Lagos");
        bank.addCustomer("Lagos","Timothy", 15000.54);

        bank.addBranch("Ibadan");
        bank.addCustomer("Ibadan", "Arolake", 68500.98);

        bank.addCustomerTransaction("Ibadan", "Adebimpe", 58222.75);
        bank.addCustomerTransaction("Ibadan", "Arolake", 10222.15);
        bank.addCustomerTransaction("Ibadan", "Enitan", 30025.00);

        bank.listCustomers("Lagos", true);
        bank.listCustomers("Asaba", true);
        bank.listCustomers("Ibadan", true);


        if (!bank.addCustomer("Ekiti", "Oluwaseun", 89550.67)){
            System.out.println("Error, Ekiti branch does not exist!");
        }

        if (!bank.addBranch("Asaba")){
            System.out.println("Asaba Branch already exists");
        }

        if (!bank.addCustomerTransaction("Lagos", "James", 8905.60)){
            System.out.println("Customer does not exist at branch");
        }

        if (!bank.addCustomer("Asaba", "Tim", 12345.67)){
            System.out.println("Customer Tim already exists");
        }
    }
}

package com.teejaywurld.main.JavaBasics.OOP.BankAccountChallenge;

//  Create a new class VipCustomer;
//  It should have 3 fields name, credit limit and email address;
//  Create 3 constructors
//      1st constructor empty should call the constructor with 3 parameters with default values;
//      2nd constructor should pass on the 2 values it receives and a default value for the 3rd;
//      3rd constructor should save all fields;
//   Create getters only for this using code generation of IntelliJ as setters won't be needed;
//   Test and confirm it works

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer(){
        this ("Default Name", 50_000.00, "default@email.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@gmail.com");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}

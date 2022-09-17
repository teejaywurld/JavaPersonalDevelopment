package com.teejaywurld.main.JavaBasics.OOP.BankAccountChallenge;

public class TransactionDetails {
    private String accountNumber;
    private double accountBalance;
    private String customersName;
    private String emailAddress;
    private String phoneNumber;


    public TransactionDetails (String accountNumber, double accountBalance, String customersName, String emailAddress, String phoneNumber){
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customersName = customersName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
    }
    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomersName() {
        return customersName;
    }

    public void setCustomersName(String customersName) {
        this.customersName = customersName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double depositAmount) {
        this.accountBalance += depositAmount;
        System.out.println("A deposit of " + depositAmount + " was made to your account. \nYour new balance is " + this.accountBalance);
        System.out.println();
    }

    public void withdrawal(double withdrawalAmount) {
        if (this.accountBalance - withdrawalAmount < 0) {
            System.out.println("Insufficient funds! Only " + accountBalance + " is available. Withdrawal not processed");
        } else {
            this.accountBalance -= withdrawalAmount;
            System.out.println("A withdrawal of " + withdrawalAmount + " processed. Your remaining \nbalance is = " + this.accountBalance);
        }
    }
}

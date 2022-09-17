package com.teejaywurld.main.JavaBasics.OOP.BankAccountChallenge;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String customersName;
    private String emailAddress;
    private String phoneNumber;
    private double deposit;
    private double withdrawal;

    public void setAccountNumber(String accountNumber){
        this.accountNumber = accountNumber;
    }
    public String getAccountNumber(){
        return this.accountNumber;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setCustomersName(String customersName){
        this.customersName = customersName;
    }
    public String getCustomersName(){
        return this.customersName;
    }
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    public String getEmailAddress(){
        return this.emailAddress;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber(){
        return this.phoneNumber;
    }
    public void setDeposit(double deposit){
        this.deposit = deposit;
    }
    public double getDeposit(){
        return deposit + balance;
    }
    public void setWithdrawal(double withdrawal){
        this.withdrawal = withdrawal;
    }
    public double getWithdrawal(){
        if (withdrawal > balance){
            System.out.println("Insufficient funds!");
        }
        return withdrawal;
    }
}

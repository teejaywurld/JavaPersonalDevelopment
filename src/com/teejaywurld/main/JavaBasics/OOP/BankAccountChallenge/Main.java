package com.teejaywurld.main.JavaBasics.OOP.BankAccountChallenge;

//  Create a new class for a bank account;
//  Create fields for the account number, balance, customer's name, email and phone number;
//
//  Create getters and setters for each field;
//  Create two additional methods:-
//      1. To allow the customer deposit funds (this should increment the balance field);
//      2. To allow the customer withdraw funds. This should deduct from the balance field but not allow the withdrawal
//      to complete if there are insufficient funds;
//  You will want to create various code in the Main class to confirm your code is working; Add some System.out.println
//  in the two methods above as well

public class Main {
    public static void main(String[] args) {
        BankAccount firstCustomer = new BankAccount();
        TransactionDetails transaction = new TransactionDetails("12345678901", 0.00,
                "Amoda Ogunlere", "omhee@gmaail.com", "07011111111");
        VipCustomer firstVip = new VipCustomer();
        System.out.println(firstVip.getName());

        VipCustomer secondVip = new VipCustomer("Bob", 25_000.00);
        System.out.println(secondVip.getName());

        VipCustomer thirdVip = new VipCustomer("Philip", 2000.00, "philip@email.com");
        System.out.println(thirdVip.getName());

        System.out.println();

        firstCustomer.setAccountNumber("3077815469");
        firstCustomer.setBalance(5000.00);
        firstCustomer.setCustomersName("Adetunji Henry");
        firstCustomer.setEmailAddress("teejaywurld@gmail.com");
        firstCustomer.setPhoneNumber("07032199678");
        firstCustomer.setDeposit(6000.00);
        firstCustomer.setWithdrawal(13000.00);

        System.out.println();
        System.out.println("*************************************************");
        System.out.println("\t\t\tTransaction Receipt");
        System.out.println("*************************************************");
        System.out.println();

        System.out.println("Your account number is: " + firstCustomer.getAccountNumber());
        System.out.println("Your initial balance is: " + firstCustomer.getBalance());
        System.out.println("Your balance after deposit is: " + firstCustomer.getDeposit());
        System.out.println("Your withdrawal amount is: " + firstCustomer.getWithdrawal());
        System.out.println("Your name is: " + firstCustomer.getCustomersName());
        System.out.println("Your email address is: " + firstCustomer.getEmailAddress());
        System.out.println("Your phone number is: " + firstCustomer.getPhoneNumber());
        System.out.println();

        System.out.println("*************************************************");

        System.out.println();

        System.out.println("Thank you for banking with us!");

        System.out.println("*************************************************");

        System.out.println();
        System.out.println();

        transaction.setAccountNumber("3077815469");
        transaction.setAccountBalance(15000.00);
        transaction.setCustomersName("Adetunji Henry");
        transaction.setEmailAddress("teejaywurld@gmail.com");
        transaction.setPhoneNumber("07032199678");
//        transaction.deposit(6000.00);
//        transaction.withdrawal(43000.00);

        System.out.println();
        System.out.println("*************************************************");
        System.out.println("\t\t\tTransaction Details");
        System.out.println("*************************************************");
        System.out.println();

        transaction.deposit(60000.00);
        transaction.withdrawal(75000.00);

        System.out.println();

        System.out.println("Your account number is: " + transaction.getAccountNumber());
        System.out.println("Your account balance is: " + transaction.getAccountBalance());
        System.out.println("Your name is: " + transaction.getCustomersName());
        System.out.println("Your email address is: " + transaction.getEmailAddress());
        System.out.println("Your phone number is: " + transaction.getPhoneNumber());
        System.out.println();

        System.out.println("*************************************************");

        System.out.println();

        System.out.println("\t\tThank you for banking with us!");

        System.out.println();

        System.out.println("*************************************************");



    }
}

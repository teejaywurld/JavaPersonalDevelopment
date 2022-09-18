package com.teejaywurld.main.JavaBasics.OOP.Polymorphism;

//  The purpose of the application is to help a fictitious company called Bills Burgers to manage their process of selling hamburgers;
//  Our application will help Bill to select types of burgers, some additional items (additions) to be added to the burgers and pricing;
//  We want to create a base hamburger, but also two other types of hamburgers that are the popular ones in Bills store;
//  The basic hamburger should have the following items;
//      Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot, etc) that the customer can select to be added to the burger;
//      Each one of these items gets charged an additional price, so you need some way to track how many items got added and to calculate the final price (base burger with          all the additions);
//      This burger has a base price and the additions are all separately priced (up to 4 additions, see above);
//      Create a Hamburger class to deal with all the above;
//      The constructor should not only include the roll type, meat and price, can also include the name of burger or you can use a setter;
//      Also create two extra varieties of Hamburgers (subclasses) to cater for
//          a)  Healthy burger (on a brown rye bread roll), plus two additional items that can be added. The healthy burger can have 6 items (Additions) in total;
//              Hint: you probably want to process the two additional items in this new class (subclass of Hamburger) not the base class (Hamburger), since the two                          additions are only appropriate for this new class (in other words, new burger type);
//          b)  Deluxe hamburger - comes with chips and drinks as additions, but no extra additions are allowed;
//              Hint: you have to find a way to automatically add these new additions at the time the deluxe burger object is created, and then prevent other additions                      being made;
//   All 3 classes should have a method that can be called anytime to show the base price of the hamburger plus all additions, each showing the addition name, and addition       price and a grand/final total for the burger (base price + all additions);
//   For the two additional classes, this may require you to be looking at the base class for pricing and then adding totals to final price;

class BillsBurger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;


    public BillsBurger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void addHamburgerAddition1(String name, double price){
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price){
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price){
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price){
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger(){
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger" + " on a " + this.breadRollType + " roll " + "with " + this.meat + ", price is " + this.price);
        if (this.addition1Name != null){
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
        }

        if (this.addition2Name != null){
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }

        if (this.addition3Name != null){
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
        }

        if (this.addition4Name != null){
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }

        return hamburgerPrice;
    }
}

class HealthyBurger extends BillsBurger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;

    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye");
    }

    public void addHealthyAddition1(String name, double price){
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price){
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if (this.healthyExtra1Name != null){
            hamburgerPrice += this.healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }

        if (this.healthyExtra2Name != null){
            hamburgerPrice += this.healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }

        return hamburgerPrice;
    }
}

class DeluxeBurger extends BillsBurger {
    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White");
        super.addHamburgerAddition1("Chips", 2.75);
        super.addHamburgerAddition2("Drinks", 1.81);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Cannot add additional items to a deluxe burger");
    }
}

public class Hamburger {
    public static void main(String[] args) {

        BillsBurger hamBurger = new BillsBurger("Basic", "Sausage", 3.56, "White");
        double price = hamBurger.itemizeHamburger();
        hamBurger.addHamburgerAddition1("Tomato", 0.27);
        hamBurger.addHamburgerAddition2("Lettuce", 0.75);
        hamBurger.addHamburgerAddition3("Carrot", 1.13);
        hamBurger.addHamburgerAddition4("Coleslaw", 0.56);
        System.out.println("Total Burger price is " + hamBurger.itemizeHamburger());

        System.out.println();

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils", 3.41);
        System.out.println("Total Healthy Burger price is " + healthyBurger.itemizeHamburger());

        System.out.println();

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition3("Should not do this", 50.53);
        deluxeBurger.itemizeHamburger();
    }
}

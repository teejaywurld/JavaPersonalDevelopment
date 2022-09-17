package com.teejaywurld.main.JavaBasics.OOP.Encapsulation;

public class Main {
    public static void main(String[] args) {

        Player player = new Player("Murphy", 50, "Sword");
        System.out.println("Initial health is " + player.getHitPoints());

        System.out.println();
        System.out.println("*****************************************************");
        System.out.println("*****************************************************");
        System.out.println();

        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + ", new total print count for printer = " + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + ", new total print count for printer = " + printer.getPagesPrinted());
    }
}

package com.teejaywurld.main.JavaBasics.OOP;

public class Main {
    public static void main(String[] args) {
        Car porsche = new Car();
        Car holden = new Car();
        porsche.setModel("Toyota");
        System.out.println("Model is " + porsche.getModel());
    }
}

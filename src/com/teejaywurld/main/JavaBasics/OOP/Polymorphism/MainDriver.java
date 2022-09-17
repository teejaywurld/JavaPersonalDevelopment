package com.teejaywurld.main.JavaBasics.OOP.Polymorphism;

//  Create a base class called Car;
//  It should have a few fields that would be appropriate for a generic car class;
//  engine, cylinder, wheels, etc;
//  Constructor should initialize cylinders (number of) and name, and set wheels to 4;
//  and engine to true. Cylinders and names would be passed parameters;
//
//  Create appropriate getters;
//
//  Create some methods like startEngine, accelerate and brake;
//
//  Show a message for each in the base class;
//  Now create 3 subclasses for your favorite vehicles;
//  Override the appropriate methods to demonstrate polymorphism in use;
//  Put all classes in the one java file (this one);

class Car {
    private String name;
    private boolean engine;
    private int cylinder;
    private int wheels;
    private int doors;

    public Car (String name, int cylinder){
        this.name = name;
        this.engine = true;
        this.cylinder = cylinder;
        this.wheels = 4;
        this.doors = doors;
    }

    public String startEngine(){
        return "Engine has not been started";
    }

    public String accelerate(){
        return "No acceleration yet";
    }

    public String brake(){
        return "No brake has been applied";
    }

    public String getName() {
        return name;
    }

    public int getDoors() {
        return doors;
    }
}

class PradoJeep extends Car {
    public PradoJeep(){
        super("Prado Jeep", 1);
    }

    @Override
    public String startEngine() {
        return "Prado Jeep's engine has been started";
    }

    @Override
    public String accelerate() {
        return "Prado Jeep's engine is been accelerated";
    }

    @Override
    public String brake() {
        return "Prado Jeep's brake has been applied and car has stopped";
    }
}

class BMW extends Car {
    public BMW(){
        super("BMW", 1);
    }

    @Override
    public String startEngine() {
        return "BMW's engine has been started";
    }

    @Override
    public String accelerate() {
        return "BMW's engine is been accelerated";
    }

    @Override
    public String brake() {
        return "BMW's brake has been applied and car has stopped";
    }
}

class MercedesBenz extends Car {
    public MercedesBenz(){
        super("Mercedes Benz", 1);
    }

    @Override
    public String startEngine() {
        return "Mercedez Benz's engine has been started";
    }

    @Override
    public String accelerate() {
        return "Mercedes Benz's engine is been accelerated";
    }

    @Override
    public String brake() {
        return "Mercedes Benz's brake has been applied and car has stopped";
    }
}

public class MainDriver {
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Car car = randomCar();
            System.out.println("Car #" + i +
                    ": " + car.getName() + "\n" +
                    "Start Engine: " + car.startEngine() + "\n" +
                    "Accelerate: " + car.accelerate() + "\n" +
                    "Brake: " + car.brake() + "\n");
        }
    }

    public static Car randomCar(){
        int randomNumber = (int) (Math.random() * 3) + 1;
        System.out.println("Random Number generated was: " + randomNumber);
        switch (randomNumber){
            case 1:
                return new PradoJeep();

            case 2:
                return new BMW();

            case 3:
                return new MercedesBenz();
        }

        return null;
    }
}

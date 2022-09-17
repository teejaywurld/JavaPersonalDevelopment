package com.teejaywurld.main.JavaBasics.OOP.Composition;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Samsung", "240", dimensions);

        Monitor theMonitor = new Monitor("32inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard);
//        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
//        thePC.getTheMotherboard().loadProgram("Windows 1.0");
//        thePC.getTheCase().pressPowerButton();
//        thePC.getMonitor().writeLetters("A and B");
        thePC.powerUp();

        System.out.println();
        System.out.println("*****************************************************");
        System.out.println("*****************************************************");
        System.out.println();

//              TODO:- Challenge 1
//        Create a single room of a house using composition;
//        Think about the things that should be in the room;
//        Maybe physical parts of the house but furniture as well;
//        Add at least one method to access an object via a getter and;
//        then that object's public method as you saw in the previous video;
//        then add at least one method to hide the object e.g. not using a getter;
//        but to access the object used in composition within the main class;
//        like you saw in this video;

//              TODO:- Solution To Challenge 1
        Room myRoom = new Room(5, 2, 3, 1);

        Door door = new Door("Gucci", "243-XR/L", "Oaks Furnitures", 2, 1);

        House myHouse = new House(myRoom, door);
        myHouse.roomOpen();

        System.out.println();
        System.out.println("*****************************************************");
        System.out.println("*****************************************************");
        System.out.println();

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedroom = new Bedroom("Teejay's", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedroom.makeBed();
        bedroom.getLamp().turnOn();
    }
}

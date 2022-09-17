package com.teejaywurld.main.JavaBasics.OOP.Composition;

public class Room {
    private int furniture;
    private int bed;
    private int stood;
    private int table;

    public Room(int furniture, int bed, int stood, int table) {
        this.furniture = furniture;
        this.bed = bed;
        this.stood = stood;
        this.table = table;
    }

    public void onSwitch(){
        System.out.println("Light switch is turned on");
    }

    public void pickRemote(){
        System.out.println("TV's remote has been picked");
    }

    public void tvOn(){
        System.out.println("TV Set has been switched on with the remote");
    }

    public int getFurniture() {
        return furniture;
    }

    public int getBed() {
        return bed;
    }

    public int getStood() {
        return stood;
    }

    public int getTable() {
        return table;
    }
}

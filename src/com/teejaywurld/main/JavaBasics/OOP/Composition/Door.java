package com.teejaywurld.main.JavaBasics.OOP.Composition;

public class Door {
    private String name;
    private String model;
    private String manufacturer;
    private int handle;
    private int lock;

    public Door(String name, String model, String manufacturer, int handle, int lock) {
        this.name = name;
        this.model = model;
        this.manufacturer = manufacturer;
        this.handle = handle;
        this.lock = lock;
    }

    public void doorLock(){
        System.out.println("Door lock has been opened");
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getHandle() {
        return handle;
    }

    public int getLock() {
        return lock;
    }
}

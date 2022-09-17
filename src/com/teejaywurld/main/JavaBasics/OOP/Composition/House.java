package com.teejaywurld.main.JavaBasics.OOP.Composition;

public class House {
    private Room room;
    private Door door;

    public House(Room room, Door door) {
        this.room = room;
        this.door = door;
    }

    public void roomOpen(){
        door.doorLock();
        room.onSwitch();
        room.pickRemote();
        room.tvOn();
    }
}

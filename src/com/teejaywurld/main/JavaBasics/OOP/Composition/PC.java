package com.teejaywurld.main.JavaBasics.OOP.Composition;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private Motherboard theMotherboard;

    public PC(Case theCase, Monitor monitor, Motherboard theMotherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.theMotherboard = theMotherboard;
    }

    public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
    }

    private void drawLogo(){
        monitor.drawPixelAt(1200, 50, "green");
    }

//    private Case getTheCase() {
//        return theCase;
//    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private Motherboard getTheMotherboard() {
//        return theMotherboard;
//    }
}

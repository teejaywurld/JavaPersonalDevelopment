package com.teejaywurld.main.JavaBasics.InnerAbstractClassesAndInterfaces.Interfaces;

public class Main {
    public static void main(String[] args) {
        ITelephone teejaysPhone;
        teejaysPhone = new DeskPhone(1234567);
        teejaysPhone.powerOn();
        teejaysPhone.callPhone(1234567);
        teejaysPhone.answer();

        System.out.println();

        teejaysPhone = new MobilePhone(245658);
        teejaysPhone.powerOn();
        teejaysPhone.callPhone(245658);
        teejaysPhone.answer();
    }
}

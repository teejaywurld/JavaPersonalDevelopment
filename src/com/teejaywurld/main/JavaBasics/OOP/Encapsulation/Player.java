package com.teejaywurld.main.JavaBasics.OOP.Encapsulation;

//  Encapsulation is the mechanism that allows you to restrict access to certain components in the objects that you are creating by protecting members of a class from external access in order to guide against unnecessary unauthorized access.

public class Player {
    private String name;
    private int hitPoints = 100;
    private String weapon;

    public Player(String name, int health, String weapon) {
        this.name = name;

        if (health > 0 && health <= 100) {
            this.hitPoints = health;
        }

        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.hitPoints = this.hitPoints - damage;
        if (this.hitPoints <= 0){
            System.out.println("Player knocked out");
            // Reduce the number of lives remaining for the player
        }
    }

    public int getHitPoints(){
        return hitPoints;
    }
}

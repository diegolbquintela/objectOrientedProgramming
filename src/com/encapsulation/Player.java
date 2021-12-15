package com.encapsulation;

public class Player {

    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damange) {
        this.health = this.health - damange;
        if (this.health <= 0) {
            System.out.println("you died");
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}


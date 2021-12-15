package com.encapsulation;

public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        player.name = "tim";
        player.health = 20;
        player.weapon = "sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("remaining health = " + player.healthRemaining());
    }
}

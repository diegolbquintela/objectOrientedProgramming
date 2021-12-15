package com.inheritance.challenge;

public class Tesla extends Car {
    private int speed;

    public Tesla(String steering, String gears, int speed) {
        super("hidraulic", "Spur Gear");
        this.speed = speed;
    }

    @Override
    public void handSteering () {
        System.out.println("automatic");
    }
}

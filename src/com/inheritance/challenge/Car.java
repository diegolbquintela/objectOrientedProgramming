package com.inheritance.challenge;

public class Car extends Vehicle {
    private String gears;



    public Car(String steering, String gears) {
        super(steering);
        this.gears = gears;
    }
    

    @Override
    public  void handSteering() {
        System.out.println("calling from car");
    }

}


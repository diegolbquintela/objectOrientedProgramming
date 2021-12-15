package com.inheritance.challenge;


//	    // Challenge.
//        // You should be able to hand steering, changing gears, and moving (speed in other words).
//        // You will want to decide where to put the appropriate state and behaviours (fields and methods).
//        // As mentioned above, changing gears, increasing/decreasing speed should be included.
//        // For you specific type of vehicle you will want to add something specific for that type of car.

public class Vehicle {
    private String steering;


    public Vehicle(String steering) {
        this.steering = steering;
    }

    public void handSteering () {
        System.out.println(("handSteering called"));
    }


}

package com.inheritance;

public class Main {

    public static void main(String[] args) {

        //create an instance/object of the animal class
        Animal animal = new Animal("animal", 1, 1, 5, 5);

        Dog dog = new Dog("yorkie", 2, 4, 1, 20, 2, 10, "long silky");
        dog.eat();
        dog.walk();
        dog.run();
    }
}

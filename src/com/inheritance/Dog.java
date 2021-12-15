package com.inheritance;

// inherit from Animal
//to access a behavior/states of a class, we use the extends keyword
public class Dog extends Animal {
    //we can also initialize more types of state
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;


    //needs a constructor for the "Dog" class, that calls the constructor of Animal
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeht, String coat) {
        // super(name, brain, body, size, weight); //super keyword allows us to initialize state of these variables,
        // by inheriting it from Animal
        super(name, 1, 1, size, weight);
        //initializing the parameters from this class
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeht;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("dog.chew() called");
    }

    @Override //allows us to adapt a method to this(dog) subclass
    public void eat() {
        super.eat();
        chew();
        System.out.println("dog eat");
    }

    public void walk() {
        System.out.println("Dog.walk()");
        super.move(5); //executes the method in the parent (animal) class
    }

    public void run() {
        System.out.println("Dog.run()");
        move(10); //execute any move method that it can find in Dog class, otherwise executes from parent
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}

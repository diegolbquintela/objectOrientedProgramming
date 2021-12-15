package com.composition;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("2208", "Dell", "240", dimensions);

        Monitor monitor = new Monitor("27inch beast", "acer", 27, new Resolution(2540, 1440));
        MotherBoard motherBoard = new MotherBoard("bj-200", "asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, monitor, motherBoard);
        // thePC.getMonitor().drawPixelAt(1500, 1200, "red"); // we can access classes from methods from objects
                                                            // that are composing the class
        thePC.powerUP();

        // with composition we can create objects of objects
    }
}

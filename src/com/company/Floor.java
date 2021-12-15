package com.company;

public class Floor {
    private double width;
    private double length;

    //constructors
    public Floor(double width, double length) {
        if (width < 0) {
            this.width = 0;
        }
        ;
        this.width = width;

        if (length < 0) {
            this.length = 0;
        }
        ;
        this.length = length;
    }


    //other methods
    public double getArea() {
        return (width * length);
    }
}
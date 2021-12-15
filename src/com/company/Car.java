package com.company;

import java.util.Locale;

//classes are templates(blueprints) for objects
public class Car {

    //to have access to the states, need to change to public
    private int doors; //state component of the object 'cars'
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    //creating a method to update state of the object
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("porsche") || validModel.equals("holden")) {
            this.model = model;
        } else {
            this.model = "unknown";
        }
    }

    public String getModel() {
        return this.model;
    }
}

package com.company;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAdress;

    //constructors
    //constructor calling constructor with all parameters, but with default values
    public VipCustomer() {
        this("Default name", 5000.00, "default@gmail.com");
    }

    //constructor passing two values and a default e-mail address
    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unkown@email.com");
    }

    // constructor with variables three states initialized
    public VipCustomer(String name, double creditLimit, String emailAdress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdress = emailAdress;
    }


    //name
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    //creditLimit
    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getCreditLimit() {
        return this.creditLimit;
    }

    //emailAdress
    public void setEmailAdress(String emailAdress) {
        this.emailAdress = emailAdress;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
}
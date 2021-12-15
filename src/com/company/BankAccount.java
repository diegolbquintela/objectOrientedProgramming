package com.company;

public class BankAccount {

    private int accNumber;
    private double balance;
    private String customerName;
    private String eMail;
    private long phoneNumber;

    //creating a constructor for the class
    public BankAccount(int accNumber, double balance, String customerName, String eMail, long phoneNumber) {
        this.accNumber = accNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
    }

    //deposit method
    public void depositBalance(double deposit) {
        this.balance += deposit;
        System.out.println("you deposited " + deposit + " and your current balance is " + this.balance);
    }

    //withdraw method
    public void withdrawMethod(double withdraw) {
        if (withdraw > balance || balance < 0) {
            System.out.println("not available funds");
        } else {
            this.balance -= withdraw;
            System.out.println("you withdraw " + withdraw + " and your remaining balance is " + this.balance);
        }
    }

    // accNumber
    public void setAccNumber(int accNumber) {
        this.accNumber = accNumber;
    }

    public int getAccNumber() {
        return this.accNumber;
    }

    // balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    // customerName
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    //eMail
    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String geteMail() {
        return this.eMail;
    }

    //phoneNumber
    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public long getPhoneNumber() {
        return this.phoneNumber;
    }
}



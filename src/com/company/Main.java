package com.company;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car(); //create an object porsche based on the car Class
        Car holden = new Car();
        porsche.setModel("Carrera"); //updating the state by calling the method
        System.out.println("model is " + porsche.getModel());

        ///////////////////////////////////////////
        // testing BankAccount
        //creating the object
        BankAccount charlesAccount = new BankAccount(12345, 1000, "Charles", "charles@gmail.com", 647572732);

        //setting account
        charlesAccount.setAccNumber(12345);
        charlesAccount.setCustomerName("Charles");
        charlesAccount.seteMail("charles@gmail.com");

        //transactions
        charlesAccount.depositBalance(1000.00);
        charlesAccount.withdrawMethod(100.00);

        VipCustomer johnVip = new VipCustomer("john", 1000.00);
        System.out.println(johnVip.getEmailAdress());

        Wall house = new Wall(-1.25, -1.25);
        house.setWidth(-1.25);
        house.setHeight(-1.25);
        System.out.println(house.getHeight());
        System.out.println(house.getWidth());
        System.out.println(house.getArea());
    }
}

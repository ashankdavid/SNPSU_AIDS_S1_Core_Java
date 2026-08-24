package com.snpsu.oops.pillars.Abstraction.CompleteAbstraction;

public interface Payment {
    void pay();

    default void refund(){
        System.out.println("Refund");
    }
}

class UPI implements Payment{
    public void pay(){
        System.out.println("Paying through UPI");
    }
}

class CreditCard implements Payment{
    public void pay(){
        System.out.println("Paying through CreditCard");
    }
}

class Cash implements Payment{
    public void pay(){
        System.out.println("Paying through Cash");
    }
}

class DriverCode{
    public static void main(String[] args) {
        Payment p = new UPI();
        p.pay();


    }
}

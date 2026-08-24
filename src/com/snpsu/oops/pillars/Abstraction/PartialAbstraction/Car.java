package com.snpsu.oops.pillars.Abstraction.PartialAbstraction;

abstract class Car {
    abstract void start();
    void brake(){
        System.out.println("Car Stops");
    }
}

class BMW extends Car{
    void start(){
        System.out.println("BMW starts with a button");
    }
}

class Toyota extends Car{
    void start(){
        System.out.println("Toyota starts with a key");
    }
}

class DriverCode1{
    public static void main(String[] args) {

    }
}

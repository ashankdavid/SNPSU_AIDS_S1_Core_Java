package com.snpsu.oops.basics.withAttributes;

public class Car {
    // attributes - instance variables
    String brand;
    int manuDate;

    Car(String b, int mDate){
        brand = b;
        manuDate = mDate;
    }

    void printDetail(){
        System.out.println("Car Brand: " + brand);
        System.out.println("Car Manu Date: " + manuDate);
    }

    public static void main(String[] args) {
        Car c1 = new Car("BMW", 2000);
        Car c2 = new Car("Audi", 1995);

        c1.printDetail();
        c2.printDetail();
    }
}

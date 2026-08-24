package com.snpsu.oops.pillars.Inheritance.Single;

public class Animal {
    void eat(){
        System.out.println("Eating...");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barking...");
    }
}

class DriverCode{
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();

        a.eat();

        d.bark();
        d.eat();
    }
}


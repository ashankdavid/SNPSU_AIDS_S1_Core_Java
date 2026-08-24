package com.snpsu.oops.pillars.Inheritance.Multilevel;

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

class Puppy extends Dog{
    void crying(){
        System.out.println("Crying...");
    }
}

class DriverCode{
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        Puppy p = new Puppy();

        a.eat();

        d.bark();
        d.eat();

        p.crying();
        p.bark();
        p.eat();
    }
}

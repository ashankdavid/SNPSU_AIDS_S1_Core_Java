package com.snpsu.oops.pillars.Inheritance.Hierrachial;

public class Animal {
    void eat(){
        System.out.println("Eating....");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Barking...");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("Meowing...");
    }
}

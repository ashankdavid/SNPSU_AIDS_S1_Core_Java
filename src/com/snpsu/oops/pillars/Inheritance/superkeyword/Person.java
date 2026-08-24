package com.snpsu.oops.pillars.Inheritance.superkeyword;

public class Person {
    String Fname;
    String Lname;

    Person(String Fname, String Lname){
        this.Fname = Fname;
        this.Lname = Lname;
    }
}


class Student extends Person{
    int rollNo;

    Student(String Fname, String Lname, int rollNo){
        super(Fname, Lname);
        this.rollNo = rollNo;
    }
}

class DriverCode{
    public static void main(String[] args) {
        Student s1 = new Student("Ashank", "David", 101);
    }
}
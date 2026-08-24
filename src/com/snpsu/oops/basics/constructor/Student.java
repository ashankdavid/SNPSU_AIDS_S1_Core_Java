package com.snpsu.oops.basics.constructor;

public class Student {
    String name;
    int rollNo;

    // normal constructor
    Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    // copy constructor
    Student(Student s1){
        this.name = s1.name;
        this.rollNo = s1.rollNo;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Ashank", 101);
        Student s2 = new Student(s1);

        System.out.println(s1 == s2);
        s2.name = "David";
        System.out.println(s2.name);
    }
}

package com.snpsu.oops.pillars.Encapsulation;

public class Employee {
    private String empName;
    private int empId;

    Employee(String empName, int empId){
        this.empName = empName;
        this.empId = empId;
    }

    String getEmpName(){
        return empName;
    }

    int getEmpId(){
        return empId;
    }

    void setEmpName(String empName){
        this.empName = empName;
    }

    void setEmpId(int eId){
        empId = eId;
    }

    void printDetails(){
        System.out.println("Employee name: " + this.empName);
        System.out.println("Employee ID: " + this.empId);
    }
}

class DriverCode{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ashank", 101);
        System.out.println(emp1.getEmpName());
        System.out.println(emp1.getEmpId());
        emp1.setEmpName("David");
        emp1.printDetails();
    }
}

package com.snpsu.oops.pillars.Abstraction.PartialAbstraction;

abstract class RBI {
    RBI(){
        System.out.println("RBI Constructor");
    }
    abstract int ROI();

    void welcomeMessage(){
        System.out.println("Welcome");
    }

    static void termsAndConditions(){
        System.out.println("Some Terms and Conditions applied....");
    }
}

class HDFC extends RBI{
    HDFC(){
        System.out.println("HDFC Constructor");
    }
    int ROI(){
        return 6;
    }

    void welcomeMessage(){
        System.out.println("Welcome to HDFC");
    }
}

class SBI extends RBI{
    int ROI(){
        return 10;
    }

    void welcomeMessage(){
        System.out.println("Welcome to SBI");
    }
}

class DriverCode2{
    public static void main(String[] args) {
        HDFC hdfc = new HDFC();
        System.out.println(hdfc.ROI());
        hdfc.welcomeMessage();
        RBI.termsAndConditions();

        SBI sbi = new SBI();
        System.out.println(sbi.ROI());
        sbi.welcomeMessage();
        RBI.termsAndConditions();
    }
}
package com.snpsu.oops.pillars.Abstraction.CompleteAbstraction;

public interface WiFi {
    void connect();
}

class Laptop implements WiFi{
    public void connect(){
        System.out.println("Laptop connected to WiFi");
    }
}

class Phone implements WiFi{
    public void connect(){
        System.out.println("Phone Connected to WiFi");
    }
}

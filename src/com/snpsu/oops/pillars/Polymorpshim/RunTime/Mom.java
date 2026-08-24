package com.snpsu.oops.pillars.Polymorpshim.RunTime;

class Mom {
    void cook(){
        System.out.println("Indian");
    }
}

class Daughter extends Mom{
    void cook(){
        System.out.println("Chinese");
    }
}

class DriveCode{
    public static void main(String[] args) {
        Mom m = new Mom();
        Daughter d = new Daughter();

        m.cook();
        d.cook();
    }
}

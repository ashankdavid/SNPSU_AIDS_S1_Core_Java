package com.snpsu.oops.pillars.Abstraction.CompleteAbstraction;

interface Mom {
    void cook();
}

interface Dad{
    void cook();
}

class Child implements Mom, Dad{
    public void cook(){

    }
}

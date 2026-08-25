package com.snpsu.Threads.Synchronization;

class Counter{
    int count = 0;
    synchronized void increment(){
        count++;
    }
}

public class Demo {
    public static void main(String[] args) {
        Counter c = new Counter();

        Thread t1 = new Thread(()->{
            for(int i=0; i<1000; i++){
                c.increment();
            }
        });

        Thread t2 = new Thread(()->{
            for(int i=0; i<1000; i++){
                c.increment();
            }
        });

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Count is: " + c.count);
    }
}

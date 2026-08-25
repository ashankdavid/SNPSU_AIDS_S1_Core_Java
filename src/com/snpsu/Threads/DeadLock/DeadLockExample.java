package com.snpsu.Threads.DeadLock;

class Lock{

}

public class DeadLockExample {
    public static void main(String[] args) {
        Lock lock1 = new Lock();
        Lock lock2 = new Lock();

        Thread t1 = new Thread(()->{
           synchronized (lock1){
               System.out.println("T1 locked lock1");
           }
           try{
               Thread.sleep(1000);
           }catch (Exception e) {}
           synchronized (lock2){
               System.out.println("T1 locked lock2");
           }
        });

        Thread t2 = new Thread(()->{
            synchronized (lock2){
                System.out.println("T2 locked lock2");
            }
            try{
                Thread.sleep(1000);
            }catch (Exception e){}
            synchronized (lock1){
                System.out.println("T2 locked lock1");
            }
        });
        t1.start();
        t2.start();
    }
}

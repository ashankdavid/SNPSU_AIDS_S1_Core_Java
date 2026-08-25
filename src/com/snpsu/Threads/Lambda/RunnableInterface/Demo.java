package com.snpsu.Threads.Lambda.RunnableInterface;

//class MyTask1 implements Runnable {
//    public void run(){
//        System.out.println("Task1 is Running");
//    }
//}
//
//class MyTask2 implements Runnable {
//    public void run(){
//        System.out.println("Task2 is Running");
//    }
//}

class Demo{
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Task1 is running!");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Task2 is running!");
            }
        });
        t1.start();
        t2.start();
    }
}

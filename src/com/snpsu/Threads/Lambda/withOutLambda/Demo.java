package com.snpsu.Threads.Lambda.withOutLambda;

interface Greeting{
    void sayHello();
}

class Demo{
    public static void main(String[] args) {
        Greeting g = new Greeting(){
            @Override
            public void sayHello(){
                System.out.println("Hello World");
            }
        };
    }
}

package com.snpsu.Threads.Lambda.withLambda;

interface Greeting {
    void sayHello();
}

class Demo{
    public static void main(String[] args) {
        Greeting g = () -> System.out.println("Hello World");
    }
}

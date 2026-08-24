package com.snpsu.methods.recursion;

public class Fibonacci {
    static int fib(int n){
        if(n==0 || n==1){
            return n;
        }else{
            return fib(n-1) + fib(n-2);
        }
    }

    public static void main(String[] args) {
        int n = 100;
        for(int i=0; i<n; i++){
            System.out.print(fib(i) + " ");
        }
    }
}

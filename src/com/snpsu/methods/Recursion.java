package com.snpsu.methods;

public class Recursion {
    static void function(int n){
        if(n==0) { // base case
            return;
        }
        System.out.println(n); // main body of the recursive function
        function(n-1); // recursive case
    }

    public static void main(String[] args) {
        function(10);
    }
}

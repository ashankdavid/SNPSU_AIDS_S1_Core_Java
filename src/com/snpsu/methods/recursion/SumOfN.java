package com.snpsu.methods.recursion;

public class SumOfN {
    static int sum(int n){
        // base case
        if(n==1){
            return 1;
        }else{
            return n + sum(n-1);
        }
    }

    public static void main(String[] args) {
        int num = 5;
        int result = sum(num);
        System.out.println(result);
    }
}

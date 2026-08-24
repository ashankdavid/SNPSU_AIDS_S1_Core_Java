package com.snpsu.ExceptionHandling;

public class E1 {
    public static void main(String[] args) {
        int i, j, k=0;
        i= 10;
        j= 2;
        try{
            k=i/j;
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[1]);
        }catch (ArithmeticException e){
            System.out.println("Cant Divide by Zero");
        }catch (Exception e){
            System.out.println("Unknown Exception Found!");
        }finally{
            System.out.println("This will Execute no matter what!!");
        }
        System.out.println("Hello");
    }static{
        System.out.println("Execution Starts");
    }
}

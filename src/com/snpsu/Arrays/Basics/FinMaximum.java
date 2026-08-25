package com.snpsu.Arrays.Basics;

public class FinMaximum {
    public static void main(String[] args) {
        int[] arr = {5,12,7,15,13,2};
        int max = arr[0];
        for(int i=1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Max is: " + max);
    }
}

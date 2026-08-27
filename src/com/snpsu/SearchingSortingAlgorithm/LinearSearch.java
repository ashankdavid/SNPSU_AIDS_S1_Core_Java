package com.snpsu.SearchingSortingAlgorithm;

public class LinearSearch {
    static int linearSearch(int key, int[] arr){
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {10, 11, 1, 7, 9, 13};
        int key = 20;
        int result = linearSearch(key, arr);
        if(result != -1){
            System.out.println("Element Found at index: " + result);
        }else{
            System.out.println("Element was not found!");
        }
    }
}
/*
Time Complexity
Best ->O1
Worst ->O(n)
 */

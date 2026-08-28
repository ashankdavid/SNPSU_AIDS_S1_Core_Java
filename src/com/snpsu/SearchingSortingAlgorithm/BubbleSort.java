package com.snpsu.SearchingSortingAlgorithm;

public class BubbleSort {
     static int[] b_s(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j<arr.length-i-1;j++){
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;

    }
    public static void main(String[] args) {
        int[] arr = {2,4,55,63,88,8};
        System.out.println("Unsorted array: ");
        for(int i = 0; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();
        int[] sorted = b_s(arr);
        System.out.println("Sorted array:");
        for(int i = 0; i<arr.length; i++){
            System.out.print(" "+sorted[i]);
        }
    }
}

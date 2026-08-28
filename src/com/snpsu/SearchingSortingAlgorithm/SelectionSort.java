package com.snpsu.SearchingSortingAlgorithm;

public class SelectionSort {
    static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int min = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 1, 30};
        selectionSort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

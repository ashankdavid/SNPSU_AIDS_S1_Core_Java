package com.snpsu.SearchingSortingAlgorithm;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length-1;

        while(low <= high){
            int mid = low + (high - low) / 2;
            if(arr[mid] == target){
                return mid + 1;
            }
            else if(arr[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 8, 12, 15, 20, 55};
        int target = 20;
        int index = binarySearch(arr, target);
        if(index != -1){
            System.out.println("Element found at index: " + index + ".");
        }
        else{
            System.out.println("Element not found.");
        }
    }
}

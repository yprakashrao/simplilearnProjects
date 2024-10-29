package practice;

import java.util.Arrays;

public class Sort012s {

    // Method to sort an array containing 0s, 1s, and 2s
    public static void sort012(int[] arr) {
        int low = 0; // Pointer for the next position of 0
        int mid = 0; // Pointer for the current element
        int high = arr.length - 1; // Pointer for the next position of 2

        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    // Swap arr[low] and arr[mid], increment both
                    swap(arr, low, mid);
                    low++;
                    mid++;
                    break;
                case 1:
                    // Just move forward
                    mid++;
                    break;
                case 2:
                    // Swap arr[mid] and arr[high], decrement high
                    swap(arr, mid, high);
                    high--;
                    break;
            }
        }
    }

    // Helper method to swap two elements in the array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Main method to test the sort012 function
    public static void main(String[] args) {
        int[] arr = {2, 0, 1, 2, 0, 1, 1, 0};
        System.out.println("Original Array: " + Arrays.toString(arr));
        
        sort012(arr);
        
        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}


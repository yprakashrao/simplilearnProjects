package practice;

public class BubbleSort {

    // Method to perform Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        // Outer loop to traverse through the entire array
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            // Inner loop to perform comparisons and swap elements
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // If no two elements were swapped, the array is already sorted
            if (!swapped) break;
        }
    }

    // Main method to test Bubble Sort
    public static void main(String[] args) {
        int[] arr = { 90,1,99,15,95,155,22,155,23,64, 34, 25, 12, 22, 11};
        
        System.out.println("Unsorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        // Call the bubbleSort method
        bubbleSort(arr);
        
        System.out.println("\nSorted array using Bubble Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}


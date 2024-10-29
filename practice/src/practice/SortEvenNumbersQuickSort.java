package practice;

import java.util.Arrays;

public class SortEvenNumbersQuickSort {
    public static void main(String[] args) {
        int[] arr = {14, 7, 2, 6, 5, 8, 6, 3, 2, 4, 8};

        // Step 1: Collect even numbers
        int[] evenNumbers = new int[arr.length];
        int evenCount = 0;

        // Store even numbers in a separate array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenNumbers[evenCount++] = arr[i];
            }
        }

        // Step 2: Sort the even numbers using Quick Sort
        quickSort(evenNumbers, 0, evenCount - 1);

        // Step 3: Put the sorted even numbers back in their original places
        int evenIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = evenNumbers[evenIndex++];
            }
        }

        // Step 4: Print the sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Quick Sort implementation
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array
            int pivotIndex = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition method used by Quick Sort
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // Choose the last element as the pivot
        int i = low - 1;        // Index of smaller element

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap arr[i + 1] and arr[high] (the pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}


 
package practice;

public class InsertionSort {

    // Method to perform Insertion Sort
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        
        // Traverse through 1 to n elements
        for (int i = 1; i < n; ++i) {
            int key = arr[i]; // Element to be inserted
            int j = i - 1;
            
            // Shift elements of arr[0..i-1], that are greater than key, to one position ahead
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key; // Place the key element at the right position
        }
    }

    // Main method to test Insertion Sort
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6};
        
        System.out.println("Unsorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        
        // Call the insertionSort method
        insertionSort(arr);
        
        System.out.println("\nSorted array using Insertion Sort:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}

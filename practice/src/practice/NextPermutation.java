package practice;

public class NextPermutation {

    public static void nextPermutation(int[] arr) {
        int n = arr.length;

        // Step 1: Find the first decreasing element from the right
        int i = n - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }
        System.out.println("the value of i is: "+i);
        // Step 2: If such an element is found, find the smallest element greater than arr[i]
        if (i >= 0) {
            int j = n - 1;
            while (arr[j] <= arr[i]) {
                j--;
            }
            // Step 3: Swap arr[i] and arr[j]
            swap(arr, i, j);
        }

        // Step 4: Reverse the elements after position i
        reverse(arr, i + 1, n - 1);
    }

    // Helper method to swap elements
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Helper method to reverse elements from start to end
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,6};

        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        nextPermutation(arr);

        System.out.println("\nNext permutation:");
        System.out.print("[");
        for (int num : arr) {
           
            System.out.print(num+",");
          
        }
        System.out.print("]");
    }
}

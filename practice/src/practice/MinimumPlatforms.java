package practice;

public class MinimumPlatforms {

    // Function to sort the array using Bubble Sort (you can also use Selection or Insertion sort)
    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    // Function to calculate the minimum number of platforms required
    public static int findPlatforms(int[] arr, int[] dep, int n) {
        // Sort both the arrays using custom Bubble Sort
        bubbleSort(arr);
        bubbleSort(dep);
        
        // Variables to track platforms needed and result
        int platformsNeeded = 1, result = 1;
        int i = 1, j = 0;
        
        // Traverse the arrival and departure arrays
        while (i < n && j < n) {
            // If the next train arrives before the previous one departs, we need a new platform
            if (arr[i] <= dep[j]) {
                platformsNeeded++;
                i++;
            }
            // Otherwise, the previous train has departed and we can free a platform
            else {
                platformsNeeded--;
                j++;
            }
            // Update the result with the maximum platforms needed so far
            result = Math.max(result, platformsNeeded);
        }
        
        return result;
    }

    public static void main(String[] args) {
        // Train arrival times (in 24-hour format, converted to integers representing time in minutes)
        int[] arr = {900, 945, 955, 1100, 1500, 1800};  // 9:00 AM, 9:45 AM, etc.
        // Train departure times (similarly converted)
        int[] dep = {920, 1200, 1130, 1150, 1900, 2000}; // 9:20 AM, 12:00 PM, etc.
        int n = arr.length;

        System.out.println("Minimum number of platforms required: " + findPlatforms(arr, dep, n));
    }
}
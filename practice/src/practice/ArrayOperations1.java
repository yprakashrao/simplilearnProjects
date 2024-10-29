package practice;

public class ArrayOperations1 {
    
	// Method to calculate the union count
    public static int unionCount(int[] arr1, int[] arr2) {
        int[] unionArray = new int[arr1.length + arr2.length];
        int index = 0;
        
        // Add all elements from arr1 to the union array
        for (int i = 0; i < arr1.length; i++) {
            unionArray[index++] = arr1[i];
        }
        
        // Add only non-duplicate elements from arr2 to the union array
        for (int i = 0; i < arr2.length; i++) {
            if (!isPresent(unionArray, arr2[i], index)) {
                unionArray[index++] = arr2[i];
            }
        }
        
        return index; // index represents the count of unique elements
    }

    // Method to calculate the intersection count
    public static int intersectionCount(int[] arr1, int[] arr2) {
        int intersectionCount = 0;
        
        // Compare each element of arr1 with arr2 for common elements
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    // Check if the element is already counted in the intersection
                    if (!isDuplicateInPrevious(arr1, i, arr1[i])) {
                        intersectionCount++;
                        break; // Move to the next element in arr1
                    }
                }
            }
        }
        return intersectionCount;
    }

    // Helper method to check if an element is already present in an array up to a certain index
    private static boolean isPresent(int[] array, int element, int length) {
        for (int i = 0; i < length; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }

    // Helper method to check if an element is already counted as a duplicate in arr1
    private static boolean isDuplicateInPrevious(int[] array, int index, int element) {
        for (int i = 0; i < index; i++) {
            if (array[i] == element) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 5, 6, 7, 8};
        
        int unionCount = unionCount(arr1, arr2);
        int intersectionCount = intersectionCount(arr1, arr2);
        
        System.out.println("Count of union: " + unionCount);
        System.out.println("Count of intersection: " + intersectionCount);
    }
}
package practice;

import java.util.Arrays;
import java.util.HashSet;

public class UnionAndIntersection {

    // Method to find union of two arrays
    public static HashSet<Integer> findUnion(int[] arr1, int[] arr2) {
        HashSet<Integer> unionSet = new HashSet<>();

        // Add elements from the first array
        for (int num : arr1) {
            unionSet.add(num);
        }

        // Add elements from the second array
        for (int num : arr2) {
            unionSet.add(num);
        }

        return unionSet; // Return the union set
    }

    // Method to find intersection of two arrays
    public static HashSet<Integer> findIntersection(int[] arr1, int[] arr2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> intersectionSet = new HashSet<>();

        // Add elements from the first array to the first set
        for (int num : arr1) {
            set1.add(num);
        }

        // Check for elements in the second array that are also in the first set
        for (int num : arr2) {
            if (set1.contains(num)) {
                intersectionSet.add(num);
            }
        }

        return intersectionSet; // Return the intersection set
    }

    // Main method to test the union and intersection functions
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {4, 5, 6, 7, 8};

        // Finding union
        HashSet<Integer> union = findUnion(array1, array2);
        System.out.println("Union: " + union);

        // Finding intersection
        HashSet<Integer> intersection = findIntersection(array1, array2);
        System.out.println("Intersection: " + intersection);
    }
}


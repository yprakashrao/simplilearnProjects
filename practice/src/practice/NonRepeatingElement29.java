package practice;

public class NonRepeatingElement29 {

    // Method to find the non-repeating element in an array
    public static int findNonRepeatingElement(int[] arr) {
        int result = 0;

        for (int num : arr) {
        	System.out.println("num: "+num);
            result ^= num; // Apply XOR operation
            System.out.println("result: "+result);
        }

        return result; // Return the non-repeating element
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] array = {2, 3, 5, 4, 5, 3, 2,6}; // Example input
        int nonRepeatingElement = findNonRepeatingElement(array);
        System.out.println("The non-repeating element is: " + nonRepeatingElement);
    }
}


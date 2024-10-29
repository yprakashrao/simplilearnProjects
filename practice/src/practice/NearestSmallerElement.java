package practice;
import java.util.Stack;

public class NearestSmallerElement {
    public static int[] nearestSmallerToLeft(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            // Pop elements from the stack while they are greater than or equal to arr[i]
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            // If stack is empty, no smaller element found
            if (stack.isEmpty()) {
                result[i] = -1; // Or any suitable value
            } else {
                result[i] = stack.peek(); // The top element is the nearest smaller
            }
            stack.push(arr[i]); // Push the current element onto the stack
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        int[] result = nearestSmallerToLeft(arr);
        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}


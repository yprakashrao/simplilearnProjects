package practice;

public class MaincolAcolB {
	public static void main(String[] args) {
        // Define colA and colB arrays
        double[] colA = {1.0, 1.2, 1.1, 1.6, 1.5, 1.4, 2.0, 2.1, 2.1, 2.2, 2.5, 2.6, 2.7, 3.0, 3.5, 3.6, 3.7, 3.8, 3.9, 4.0, 4.1, 4.2, 4.3, 4.4, 4.5};
        int[] colB = {10, 12, 11, 15, 18, 16, 5, 65, 5, 3, 35, 25, 20, 65, 88, 95, 95, 45, 55, 22, 15, 66, 21, 65, 82};

        // Variables to store the highest values for each group
        int highest1 = Integer.MIN_VALUE;
        int highest2 = Integer.MIN_VALUE;
        int highest3 = Integer.MIN_VALUE;
        int highest4 = Integer.MIN_VALUE;
        // First, find the relevant values for each group in colA and colB
        for (int i = 0; i < colA.length; i++) {
            // Group based on the whole number in colA (1.0, 2.0, 3.0, 4.0)
            if (colA[i] >= 1.0 && colA[i] < 2.0) {
                if (colB[i] > highest1) {
                    highest1 = colB[i];
                }
            } else if (colA[i] >= 2.0 && colA[i] < 3.0) {
                if (colB[i] > highest2) {
                    highest2 = colB[i];
                }
            } else if (colA[i] >= 3.0 && colA[i] < 4.0) {
                if (colB[i] > highest3) {
                    highest3 = colB[i];
                }
            } else if (colA[i] >= 4.0 && colA[i] < 5.0) {
                if (colB[i] > highest4) {
                    highest4 = colB[i];
                }
            }
        }

        // Output the results
        System.out.println("1.0's highest number is " + highest1);
        System.out.println("2.0's highest number is " + highest2);
        System.out.println("3.0's highest number is " + highest3);
        System.out.println("4.0's highest number is " + highest4);
    }
}

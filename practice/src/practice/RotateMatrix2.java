package practice;

public class RotateMatrix2 {
	
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Print original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Rotate the matrix by 90 degrees clockwise
        rotateMatrix90Degrees(matrix);

        // Print rotated matrix
        System.out.println("Matrix after 90-degree rotation:");
        printMatrix(matrix);
    }

    // Function to rotate the matrix by 90 degrees clockwise
    public static void rotateMatrix90Degrees(int[][] matrix) {
        // Step 1: Transpose the matrix (convert rows to columns)
        transposeMatrix(matrix);

        // Step 2: Reverse each row
        for (int i = 0; i < matrix.length; i++) {
            reverseRow(matrix[i]);
        }
    }

    // Function to transpose the matrix
    public static void transposeMatrix(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Swap element at (i, j) with element at (j, i)
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    // Function to reverse a row
    public static void reverseRow(int[] row) {
        int start = 0;
        int end = row.length - 1;
        while (start < end) {
            int temp = row[start];
            row[start] = row[end];
            row[end] = temp;
            start++;
            end--;
        }
    }

    // Function to print the matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}


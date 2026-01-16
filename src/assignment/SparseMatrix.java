package assignment;

public class SparseMatrix {
    public static void main(String[] args) {

        int[][] matrix = {
            {0, 0, 3},
            {0, 0, 0},
            {5, 0, 0}
        };

        int rows = matrix.length;
        int cols = matrix[0].length;

        int zeroCount = 0;
        int nonZeroCount = 0;

        // Count zero and non-zero elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroCount++;
                } else {
                    nonZeroCount++;
                }
            }
        }

        // Check sparse condition
        if (zeroCount > nonZeroCount) {
            System.out.println("Sparse Matrix");
        } else {
            System.out.println("Not a Sparse Matrix");
        }
    }
}

package assignment;

public class MagicMatrix {
	static void checkMagicMatrix(int[][] mat, int n) {

        int sum1 = 0, sum2 = 0;

        //  diagonal sums
        for (int i = 0; i < n; i++) {
        	sum1  += mat[i][i];
        	sum2 += mat[i][n - 1 - i];
        }

        // if diagonal sums are not equal --→ not magic
        if (sum1  != sum2) {
            System.out.println("Not a Magic Matrix");
            return;
        }

        //  row and column sums
        for (int i = 0; i < n; i++) {
            int rowSum = 0, colSum = 0;

            for (int j = 0; j < n; j++) {
                rowSum += mat[i][j];
                colSum += mat[j][i];
            }

            if (rowSum != sum1  || colSum != sum2) {
                System.out.println("Not a Magic Matrix");
                return;
            }
        }

        System.out.println("Magic Matrix");
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {2, 7, 6},
            {9, 5, 1},
            {4, 3, 8}
        };

        int n = 3;
        checkMagicMatrix(matrix, n);
    }

}

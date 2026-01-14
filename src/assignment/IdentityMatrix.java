package assignment;

public class IdentityMatrix {
	    static void checkMatrix(int[][] mat) {

	        int n = mat.length;
	        int sum = 0;
	        boolean isIdentity = true;

	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++) {

	                
	                if (i == j) {
	                    sum += mat[i][j];
	                    if (mat[i][j] != 1)
	                        isIdentity = false;
	                }
	                // non-diagonal
	                else {
	                    if (mat[i][j] != 0)
	                        isIdentity = false;
	                }
	            }
	        }

	        System.out.println("Sum of primary diagonal = " + sum);

	        if (isIdentity)
	            System.out.println("Matrix is an Identity Matrix");
	        else
	            System.out.println("Matrix is NOT an Identity Matrix");
	    }

	   public static void main(String[] args) {

	        int[][] matrix = {
	            {1, 0, 0},
	            {0, 1, 0},
	            {0, 0, 1}
	        };

	        checkMatrix(matrix);
	    }
	}


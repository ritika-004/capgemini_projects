package assignment;

public class ArrayNumIncrease {

	    static int[] increment(int[] arr) {

	        int num = 0;

	        // array to number
	        for (int i = 0; i < arr.length; i++) {
	            num = num * 10 + arr[i];
	        }

	        //Increment number
	        num = num + 1;

	        //  Counting digits of incremented number
	        int temp = num;
	        int digits = 0;
	        while (temp > 0) {
	            digits++;
	            temp /= 10;
	        }

	        // new array
	        int[] result = new int[digits];

	        // digits into array
	        for (int i = digits - 1; i >= 0; i--) {
	            result[i] = num % 10;
	            num /= 10;
	        }

	        return result;
	    }

	    public static void main(String[] args) {

	        int[] arr = {1, 2, 3};

	        System.out.println("Original:");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }

	        System.out.println();

	        int[] output = increment(arr);

	        System.out.println("Modified:");
	        for (int j = 0; j < output.length; j++) {
	            System.out.print(output[j] + " ");
	        }
	    }

}



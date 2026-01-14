package assignment;

public class Separate {
	    static void segregate(int[] arr) {

	        int count1 = 0;

	        // counting number of 1s
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == 1) {
	                count1++;
	            }
	        }

	        //  1s first
	        for (int i = 0; i < count1; i++) {
	            arr[i] = 1;
	        }

	        //  0s after 1s
	        for (int i = count1; i < arr.length; i++) {
	            arr[i] = 0;
	        }
	    }

	    public static void main(String[] args) {

	        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 0, 1};

	        segregate(arr);

	        System.out.println("Result:");
	        for (int i = 0; i < arr.length; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }
	}


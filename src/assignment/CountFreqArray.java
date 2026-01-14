package assignment;

public class CountFreqArray {

	    // function to count frequency
	    static void countFrequency(int[] arr) {

	        int n = arr.length;

	        System.out.println("Element : Frequency");

	        for (int i = 0; i < n; i++) {

	            int count = 1;

	            
	            if (arr[i] == -1)
	                continue;

	            for (int j = i + 1; j < n; j++) {
	                if (arr[i] == arr[j]) {
	                    count++;
	                    arr[j] = -1;   // mark as counted
	                }
	            }

	            System.out.println(arr[i] + " : " + count + " times");
	        }
	    }

	    public static void main(String[] args) {

	        int[] arr = {1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, 5};

	        countFrequency(arr);
	    }
	}


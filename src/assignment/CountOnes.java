package assignment;

public class CountOnes {
	 public static void main(String[] args) {

	        int n = 10;   // pre-given input
	        int count = 0;

	        while (n > 0) {
	            if (n % 2 == 1) {
	                count++;
	            }
	            n = n / 2;
	        }

	        System.out.println("Number of 1s: " + count);
	        if(count%2==0)
	        	System.out.println("Evil number");
	        else
	        	System.out.println("Not evil number");
	    }

}

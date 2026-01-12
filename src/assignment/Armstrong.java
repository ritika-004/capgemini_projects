package assignment;

public class Armstrong {
	 public static void main(String[] args) {

	        int num = 153;  
	        int temp = num, sum = 0, digits = 0;

	        int n = num;
	        while (n > 0) {
	            digits++;
	            n /= 10;
	        }

	        while (temp > 0) {
	            int rem = temp % 10;
	            sum += Math.pow(rem, digits);
	            temp /= 10;
	        }

	        if (sum == num)
	            System.out.println(num + " is an Armstrong Number");
	        else
	            System.out.println(num + " is NOT an Armstrong Number");
	    }

}

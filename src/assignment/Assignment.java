package assignment;

public class Assignment {
	 public static void main(String[] args) {

	        int n = 10;   
	        String binary = "";

	        while (n > 0) {
	            binary = (n % 2) + binary;
	            n = n / 2;
	        }

	        System.out.println("Binary: " + binary);
	    }

}

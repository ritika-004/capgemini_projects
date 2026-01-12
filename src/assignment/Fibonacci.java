package assignment;

public class Fibonacci {
	public static void main(String[]args)
	{
		int n=5;
		 int a = 0, b = 1;

	        while (a < n) {
	            System.out.print(a + " ");
	            int c = a + b;
	            a = b;
	            b = c;
	        }
	}

}

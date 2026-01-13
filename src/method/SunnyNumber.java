package method;

public class SunnyNumber {
	public static boolean check(int n)
	{  
		int num=n+1;
	        int sqrt = (int) Math.sqrt(num);

	        if (sqrt * sqrt == num)
	        	return true;
	        else
	        	return false;
	        	
	}
	
	public static void main(String[]args)
	{
		int n=15;
		if(check(n)==true)
			System.out.println("Sunny number");
		else
			System.out.println("not sunny number");
			
	}

}

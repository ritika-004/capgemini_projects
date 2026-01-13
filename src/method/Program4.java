package method;

public class Program4 {
	public static void main(String[]args) 
	{//calling method
		System.out.println(num(10,20));
		System.out.println(num(10,20,30));
		
	}
	
	//method overloading
	public static int num(int a,int b)
	{//called method
		
		return a+b;
	}
	public static int num(int a,int b,int c)
	{//called method
		
		return a+b+c;
	}

}

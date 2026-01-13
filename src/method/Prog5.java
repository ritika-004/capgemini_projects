package method;

public class Prog5 {
	public static void main(String[]args) 
	{//calling method
		num(1,2);
		num('a','b');
		num('a',20.5);
		
	}
	
	//method overloading
	public static void num(int a,int b)
	{//called method
		//implementation
		System.out.println("int,int");
	}
	public static void num(double a,double b)
	{//called method
		
		System.out.println("double,double");
	}
	public static void num(char a,char b)
	{//called method
		
		System.out.println("char,char");
	}
	public static void num(int a,char b)
	{//called method
		
		System.out.println("int,char");
	}
	public static void num(char a,int b)
	{//called method
		
		System.out.println("char,int");
	}

}

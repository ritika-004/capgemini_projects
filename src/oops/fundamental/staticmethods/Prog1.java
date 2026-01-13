package oops.fundamental.staticmethods;

public class Prog1 {
	static int i;
	public static void main(String[]args)
	{
		System.out.println(" Prog2 main start");
		System.out.println(" Prog2 main end");
	}
	
	public static void test1()
	{
		System.out.println(i);
		System.out.println("test1() from Prog1");
		
	}

}

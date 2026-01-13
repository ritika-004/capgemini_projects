package oops.fundamental.stringinitiallizer;

public class Prog1 {
	//application ---> opening 
	static int i=test();//static initializer                                  
	public static void main(String[]args)
	{
		System.out.println("main start");
		System.out.println(i);
		System.out.println("main end");
	}
	public static int test()
	{
		System.out.println("test");
		System.out.println(i);
		return 10;
	}

}

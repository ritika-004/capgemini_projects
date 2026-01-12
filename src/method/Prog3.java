package method;

public class Prog3 {
	public static void main(String[]args) 
	{//calling method
		System.out.println("main start");
		System.out.println(test());
		System.out.println("main end");
	}
	public static String test()
	{//called method
		System.out.println("test start");
		System.out.println("test end");
		return "hello";
	}
}

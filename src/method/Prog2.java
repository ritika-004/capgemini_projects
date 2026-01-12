package method;

public class Prog2 {
	public static void main(String[]args) 
	{//calling method
		System.out.println("main start");
		test();
		System.out.println("main end");
	}
	public static void test()
	{//called method
		System.out.println("test start");
		System.out.println("test end");
	}

}

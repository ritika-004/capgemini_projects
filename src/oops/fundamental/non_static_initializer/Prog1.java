package oops.fundamental.non_static_initializer;

public class Prog1 {
	
	static {
		System.out.println("Static block 1");
	}
	//non static initializer
	{
		System.out.println("non Static block 3");
	}
	public static void main(String[]args)
	{
		System.out.println("main");
		new Prog1();
		new Prog1();
		
	}
	public int test()
	{
		System.out.println("test");
		return 10;
	}
	int a=test();
	

}

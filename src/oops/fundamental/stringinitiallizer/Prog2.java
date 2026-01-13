package oops.fundamental.stringinitiallizer;

public class Prog2 {
	static int i=20;//single line initializer
	static //multi line initializer
	{
		i=30;
		System.out.println(i);
		System.out.println("static initializer block1 ");
		i=test1();
	}
	public static void main(String[]args)
	{
		System.out.println("main start");
		System.out.println(i);
		System.out.println("main end");
	}
	public static int test1()
	{
		System.out.println("test1");
		System.out.println(i);
		return 10;
	}
	static
	{
		System.out.println("static initializer block 2");
	}

}

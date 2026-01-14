package oops.fundamental.non_static;

public class Prog5 {
	int a=10;
	static String s="Hi";
	public static void main(String[]args)
	{
		Prog5 obj1=new Prog5();
		obj1.a=100;
		obj1.s="hello";
		Prog5 obj2=new Prog5();
		System.out.println(obj2.a);
		System.out.println(obj2.s);
	}

}

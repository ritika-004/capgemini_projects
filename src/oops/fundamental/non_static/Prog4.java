package oops.fundamental.non_static;

public class Prog4 {
	int i=3;
	static String s="hello";
	public static void main(String[]args)
	{
		Prog4 obj1=new Prog4();
		Prog4 obj2=new Prog4();
		
		System.out.println(obj1==obj2);
		System.out.println(obj1.i);
		System.out.println(Prog4.s);
		System.out.println(obj1.s);//accessing static with obj reference
	}

}

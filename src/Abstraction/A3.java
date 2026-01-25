package Abstraction;

public class A3 extends A2{
	public void a()
	{
		System.out.println("A3 implementation");
	}
	public void a3()
	{
		System.out.println("A3()");
	}
	public static void main(String[] args) {
		A1 a1=new A3();
		a1.a();
		a1.a1();
		//a1.a2();//cte
		
		A3 a3=(A3) a1;
		a3.a();
		a3.a1();
		a3.a2();
		a3.a3();
	}

}

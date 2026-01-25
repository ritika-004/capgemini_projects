package Abstraction;

public class B extends A{
	public void test()
	{
		System.out.println("b implementation");
	}
	public void testB()
	{
		System.out.println("test b");
	}
	public static void main(String[] args) {
		A a=new B();//upcasting
		a.testA();
		a.test();
		B b= (B) a;//downcasting
		b.testA();
		b.test();
		b.testB();
		
	}
	
	

}

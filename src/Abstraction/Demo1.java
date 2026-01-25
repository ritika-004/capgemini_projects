package Abstraction;

public class Demo1 implements I3{
	public void testA()
	{
		System.out.println("Demo testA");
	}
	public void testB()
	{
		System.out.println("Demo testB");
	}
		public void testC()
		{
			System.out.println("Demo testC");
		}
		public static void main(String[] args) {
			// I3 i1=new I3(); CTE
			I3 i2=new Demo1();
			i2.testA();
			i2.testB();
			//i2.testC(); CTE  as i2 doesnt have testC
			
		}
	

}

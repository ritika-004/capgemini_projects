package association;

public class Test2 {
	public static void main(String[] args) {
		
		car2 c=new car2();
		c.setBrand("A");
		c.setPrice(20000000);
		
		Tyre t=c.getTyre();
		System.out.println(t);
	}

}

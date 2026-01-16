package encapsulation;

public class Test3 {
	public static void main(String[] args) {
		demo obj=demo.getA();
		obj.set(30);
		int b=obj.getValueA();
		System.out.println(b);
	}

}

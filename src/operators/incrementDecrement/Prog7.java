package operators.incrementDecrement;

public class Prog7 {
public static void main(String[]args) {
		
		int a=5;
		int b=a++ + --a + a--;
		int c= b++ + ++a + a-- + --b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}

}

package operators.incrementDecrement;

public class Prog4 {
public static void main(String[]args) {
		
		int a=3;
		int b=++a + a++;
		int c= b++ + ++a + b++ + a++;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}

}

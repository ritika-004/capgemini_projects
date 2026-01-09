package operators.logical;

public class Prog3 {
public static void main(String[]args) {
		//logical NOt unary
		
		System.out.println(!false);
		System.out.println(!true);
		int a=6;
		System.out.println(!(a<10) || ++a>10);
	    System.out.println(a);
	    
	    int b=6;
		System.out.println(!(b<10) && ++a>10);
	    System.out.println(b);
	    
	}

}

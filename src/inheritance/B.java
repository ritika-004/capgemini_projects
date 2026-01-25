package inheritance;

public class B extends A{
	static int j=20;
	public static void main(String[] args) {
		
		System.out.println(A.i);
		System.out.println(B.i);
		B.print();
		//System.out.println(A.j); not possible 
		System.out.println(B.j);
		
		//i --> A-- > B --> generalized member
		//j-->b--> specialized member
	}

}

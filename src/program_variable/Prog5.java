package program_variable;

public class Prog5 {
	public static void main(String[]args) {
		char c='A';
		
		int i=c; //will take ASCII value of c
		//widening 2 byte ---> 4byte ----> implicit typecasting
		
		System.out.println(i);
		
		int j=65;
		char g=(char) j;
		System.out.println(g);
	}

}

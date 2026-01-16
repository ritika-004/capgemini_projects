package stringBuilder;

public class Prog2 {
	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder("hello");
		sb.append("123456789123456");
		System.out.println(sb.capacity());//default 16+5 for hello
		StringBuilder sb1= new StringBuilder(1000);
		System.out.println(sb1.capacity());
	}

}

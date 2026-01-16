package stringBuilder;

public class Prog1 {
	public static void main(String[] args) {
		StringBuilder sb= new StringBuilder();
		System.out.println(sb.capacity());
		sb.append("123456789741258961234");
		System.out.println(sb.capacity());
		sb.append("123456789741258961234");
		System.out.println(sb.capacity());
		
	}

}

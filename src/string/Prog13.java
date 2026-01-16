package string;

public class Prog13 {
	public static void main(String[] args) {
		String s="@!#java#sd";
		String s1[]=s.split("[^a-zA-Z0-9]");
		for(int i=0;i<s1.length;i++)
			System.out.println(s1[i]);
	}

}

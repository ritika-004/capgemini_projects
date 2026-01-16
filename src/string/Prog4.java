package string;

public class Prog4 {
	public static void main(String[] args) {
		String s="hello";
		System.out.println(s.equals("hello"));
		System.out.println(s.length());
		char[]ch = s.toCharArray();
		for(int i=0;i<ch.length;i++)
			System.out.println(ch[i]);
		
		System.out.println(s.charAt(0));
		byte[] b=s.getBytes();
		for(int j=0;j<b.length;j++)
			System.out.println(b[j]);
		
		System.out.println(s.startsWith("h"));
		System.out.println(s.endsWith("o"));
		System.out.println(s.replace("h", "y"));
		System.out.println(s.contains("z"));
		System.out.println(s.indexOf("l"));
		System.out.println(s.indexOf("k"));
		
		
		String d="java is a programming language";
		String [] res= d.split(" ");
		for(int k=0;k<res.length;k++)
			System.out.println(res[k]);
	}

}

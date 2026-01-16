package encapsulation;

public class Test4 {
	public static void main(String[] args) {
		//Math obj=new Math();
		//the constructor Math() is private hence not visible
		System.out.println(Math.max(13,4));
		System.out.println(Math.floor(13.4));
		System.out.println(Math.ceil(13.4));
		System.out.println(Math.PI);
		System.out.println(Math.log(10));
		System.out.println(Math.pow(2,4));
	}

}

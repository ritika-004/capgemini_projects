package object;

public class Dummy1 {
	public int hashCode()
	{
		return 100;
	}
	public static void main(String[] args) {
		
		
		Dummy1 d=new Dummy1();
		System.out.println(d.hashCode());
	}

}

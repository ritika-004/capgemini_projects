package inheritance;

public class C extends B1 {
	int c=300;
	public void c()
	{
		System.out.println("c()");
	}
	public C()
	{
		System.out.println("c constructor");
		
	}
	{
		System.out.println("c non static init");
	}
	public static void main(String[] args) {
		C obj=new C();
		System.out.println(obj.c); //300
		System.out.println(obj.b); //200 
		System.out.println(obj.a); //100
		obj.c();
		obj.b();
		obj.a();


}
}
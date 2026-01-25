package inheritance;

public class Test1 {
	//downcasting
	public static void main(String[] args) {
		WhiteTiger ob= new WhiteTiger();
		Animal a =ob; //upcasting
		a.walk();
		
		Tiger tiger=(Tiger) a ; //downcasting
		
		tiger.walk();
		tiger.roar();
		
		WhiteTiger obj=(WhiteTiger) tiger;
		obj.walk();
		obj.roar();
		obj.whiteColour();
	}

}

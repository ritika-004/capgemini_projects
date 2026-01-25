package inheritance;

public class Test {
	public static void main(String[] args) {
		WhiteTiger ob=new WhiteTiger();
		ob.whiteColour();
		ob.roar();
		ob.walk();
		
		Tiger tiger=ob; //upcasting
		tiger.roar();
		tiger.walk();
		//tiger.whiteColour(); //cte
		
		Animal a=tiger;
		a.walk();
		//a.roar();
		//a.whiteColour();
	}

}

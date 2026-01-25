package polymorphism;

public class Test {
	public static void main(String[] args) {
		Lion obj=new Lion();
		obj.sound();
		
		Dog d=new Dog();
		d.sound();
		
		//upcasting
		Animal a=new Lion();
		a.sound(); //method overriding
		
		Animal a2=new Dog();
		a2.sound();
		
				
	}

}

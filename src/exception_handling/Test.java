package exception_handling;

public class Test {
	public static void main(String[] args) {
		Student obj=new Student();
		System.out.println("Program started");
		try {
		obj.setAge(0);}
		catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Age is :"+obj.getAge());
		try {
		obj.setName("ritika");}
		catch(InvalidNameException e){
			System.out.println(e.getMessage());
		}
		System.out.println("Name is :"+obj.getName());
		System.out.println("Program ended");
	}

}

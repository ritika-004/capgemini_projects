package inheritance;

public class Person {
	int age;
	String name;
	public Person(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	public void displayPerson()
	{
		System.out.println(this.name);
		System.out.println(this.age);
	}

}

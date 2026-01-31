package hash_set;

import java.util.HashSet;

public class PersonDemo {
	public static void main(String[] args) {
		HashSet<Person> hs2=new HashSet<Person>();
		Person p1= new Person(1,"rohit@gamil.com",20);
		Person p2= new Person(1,"rohit@gmail.com",25);
		Person p3= new Person(2,"rohit@gmail.com",30);
		
		hs2.add(p1);
		hs2.add(p2);
		hs2.add(p3);
		
		System.out.println(hs2);
	}

}

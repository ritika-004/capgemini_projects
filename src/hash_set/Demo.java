package hash_set;

import java.util.HashSet;

public class Demo {
	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<Integer>();
		
		hs.add(10);
		hs.add(30);
		hs.add(2);
		hs.add(40);
		hs.add(2);
		hs.add(100);
		
		System.out.println(hs);
		Integer i1=10;
		Integer i2=10;
		Integer i3=20;
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		System.out.println(i3.hashCode());
		System.out.println(i1.equals(i2));
		System.out.println(i1.equals(i3));
		
		
		HashSet<Employee> hs2=new HashSet<Employee>();
		Employee e1= new Employee(1,"Rohit",20000);
		Employee e2= new Employee(1,"Rohit",20000);
		Employee e3= new Employee(1,"Rohit",20000);
		
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		
		hs2.add(e1);
		hs2.add(e2);
		hs2.add(e3);
		
		System.out.println(hs2);
	}

}

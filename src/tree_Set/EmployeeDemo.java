package tree_Set;

import java.util.TreeSet;

public class EmployeeDemo {
	public static void main(String[] args) {
		TreeSet<Employee> ts= new TreeSet<Employee>();
		Employee e1= new Employee(3,"Raj",70000);
		Employee e2= new Employee(1,"Ankita",30000);
		Employee e3= new Employee(2,"Rohit",30000);
		Employee e4= new Employee(4,"Rohan",40000);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		System.out.println(ts);
	}

}

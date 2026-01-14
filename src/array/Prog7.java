package array;

public class Prog7 {
	public static void main(String[]args) {
	Employee[] employee =new Employee[3];
	employee[0]=new Employee(1,"a",10000);
	employee[1]=new Employee(2,"b",20000);
	employee[2]=new Employee(3,"c",30000);
	
	for(int i=0;i<employee.length;i++)
		employee[i].display();
	}

}

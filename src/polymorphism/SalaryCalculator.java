package polymorphism;

import java.util.Scanner;

public class SalaryCalculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter how many employees to add");
		int n=sc.nextInt();
		sc.nextLine();
		
		Employee[] employee=new Employee[n];
		
		for(int i=0;i<n;i++)
		{
			System.out.println("enter employee id");
			int id=sc.nextInt();
			sc.nextLine();
			
			System.out.println("enter employee name");
			String name=sc.nextLine();
			
			System.out.println("1. Permanent employee");
			System.out.println("2. Payroll employee");
			System.out.println("Choose optn");
			int choice=sc.nextInt();
			sc.nextLine();
			
			switch(choice)
			{
			case 1: {
				System.out.println("enter the basic salary");
				double salary = sc.nextDouble();
				PermanentEmployee pe=new PermanentEmployee(id,name,salary);
				employee[i]=pe;
				break;
			}
			
			case 2:{
				System.out.println("enter the hours");
				int hours=sc.nextInt();
				sc.nextLine();
				
				System.out.println("enter the rate");
				double rate=sc.nextDouble();
				sc.nextLine();
				
				PayrollEmployee pr=new PayrollEmployee(id,name,hours,rate);
				employee[i]=pr;
				
				break;
			}
			}
			
		}
		for(Employee emp : employee) {
			emp.displayDetails();
			System.out.println(emp.calculateSalary());
		}
	}

}

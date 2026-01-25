package polymorphism;

import java.util.Scanner;

public class MyApp extends AreaCalculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter choice  1. for square area 2. for rectangle area  3. for circle area 4. exit");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1: 
			System.out.println("enter length of side for square");
		    double s=sc.nextDouble();
		    double area=calculateArea(s);
		    System.out.println("Area of square : "+area);
		    break;
		case 2:
			System.out.println("enter length and breadth for rectangle");
		    double l=sc.nextDouble();
		    double b=sc.nextDouble();
		    double area2=calculateArea(l,b);
		    System.out.println("Area of rectangle : "+area2);
		    break;
		case 3:
			System.out.println("enter radius of circle");
		    float r=sc.nextFloat();
		    float area3=calculateArea(r);
		    System.out.println("Area of circle : "+area3);
		    break;
		case 4:
			System.exit(0);
			break;
		default:
			System.out.println("Wrong input");
			
			
		        		
		}
	}

}

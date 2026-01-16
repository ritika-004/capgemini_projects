package user_input;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data1");
		int a = sc.nextInt();
		System.out.println("Enter the data2");
		byte b = sc.nextByte();
		System.out.println("Enter the data 3");
		double d=sc.nextDouble();
		System.out.println(b+a+d);

	}

}

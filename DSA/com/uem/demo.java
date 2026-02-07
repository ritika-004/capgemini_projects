package com.uem;

public class demo implements Calcu{
	public int add(int n, int m)
	{
		return n+m;
	} 
	public static void main(String[] args) {
		demo d= new demo();
		int sum=d.add(5, 10);
		System.out.println(sum);
	}

}

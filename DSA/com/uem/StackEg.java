package com.uem;

import java.util.Stack;

public class StackEg {
	public static void main(String[] args) {
		Stack<Integer> s= new Stack<Integer>();
		
		System.out.println("Adding Element : ");
		System.out.println(s.push(20));
		System.out.println(s.push(40));
		System.out.println(s.push(60));
		System.out.println(s.isEmpty());
		
		while(s.isEmpty()==false)
		{
			System.out.println("Popping element : " +s.pop());
		}
		
		
		
		
				
	}
}

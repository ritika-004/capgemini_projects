package stack;

import java.util.Stack;

public class StackMethods {
	public static void main(String[] args) {
		
		Stack<Integer> stack=new Stack<Integer>();
		System.out.println(stack);
		
		stack.push(100);
		stack.push(200);
		stack.push(300);
		stack.push(400);
		
		System.out.println("After push() : "+stack);
		
		stack.pop();
		System.out.println("After pop() : "+stack);
		
		System.out.println("Peek() : "+stack.peek());
		System.out.println("After peek() : "+stack);
		
		System.out.println("empty() : "+stack.empty());
		
		System.out.println("search() : "+stack.search(300));
	}

}

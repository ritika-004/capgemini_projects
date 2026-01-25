package linkedlist;

import java.util.LinkedList;

public class LinkedListMethods {
public static void main(String[] args) {
	LinkedList<String> list = new LinkedList<String>();
	
	System.out.println(list);
	list.addFirst("A");
	list.addFirst("B");
	System.out.println("After adding: " + list);
	
	System.out.println(list);
	list.addLast("C");
	list.addLast("D");
	System.out.println("After adding: " + list);
	
	System.out.println(list);
	System.out.println("getFirst(): " + list.getFirst());
	
	System.out.println(list);
	System.out.println("getLast(): " + list.getLast());
	
	System.out.println(list);
	System.out.println("removeFirst(): " + list.removeFirst());
	System.out.println(list);
	
	System.out.println(list);
	System.out.println("removeLast(): " + list.removeLast());
	System.out.println(list);
	
	System.out.println(list);
	System.out.println("offerFirst(): " + list.offerFirst("E"));
	System.out.println(list);
	
	System.out.println(list);
	System.out.println("offerLast(): " + list.offerLast("H"));
	System.out.println(list);
	
	System.out.println(list);
	System.out.println("pollFirst(): " + list.pollFirst());
	System.out.println(list);
	
	System.out.println(list);
	System.out.println("pollLast(): " + list.pollLast());
	System.out.println(list);
	
	System.out.println(list);
	System.out.println("peekFirst(): " + list.peekFirst());
	System.out.println(list);
	
	System.out.println(list);
	System.out.println("peekLast(): " + list.peekLast());
	System.out.println(list);
}
}

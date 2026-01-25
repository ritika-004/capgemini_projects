package array_list;

import java.util.ArrayList;

public class ArrayList1 {
	public static void main(String[] args) {
		ArrayList<String> list1=new ArrayList<String>();
		
		list1.add("mango");
		list1.add("banana");
		list1.add("apple");
		
		System.out.println(list1);
		//list1.add(100); CTE
		
		ArrayList list2=new ArrayList();
		list2.add(101);
		list2.add("hello");
		list2.add('a');
		list2.add(true);
		list2.add(100.50);
		System.out.println(list2);
		
		
	}

}

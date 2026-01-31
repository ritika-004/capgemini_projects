package hash_set;

import java.util.ArrayList;
import java.util.HashSet;

public class Demo1 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(10);
		list.add(20);
		list.add(40);
		list.add(50);
		 HashSet<Integer> hs = new HashSet<Integer>();
		 HashSet<Integer> duplicate = new HashSet<Integer>();
		 for(int n : list)
		 {
			 if(!hs.add(n))
				 duplicate.add(n);
		 }
		 System.out.println(duplicate);
			 
			 
		 
		
		
		
	}

}

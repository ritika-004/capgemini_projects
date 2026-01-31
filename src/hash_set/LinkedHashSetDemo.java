package hash_set;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.ListIterator;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhs= new LinkedHashSet<Integer>();
		lhs.add(100);
		lhs.add(50);
		lhs.add(70);
		lhs.add(10);
		
		System.out.println(lhs);
		
		//iterate here using foreach,Iterator,ListIterator
		for(int i: lhs)
		{
			System.out.println(i);
		}
		System.out.println("==========================================");
		Iterator<Integer> itr = lhs.iterator();
		while(itr.hasNext())
		{
			int n=itr.next();
			
			System.out.println(n);
		}
		
		System.out.println("============================================");
		
		ArrayList<Integer> al= new ArrayList<Integer>(lhs);
		ListIterator<Integer> itr2= al.listIterator();
		while(itr2.hasNext())
		{
			
		     System.out.println(itr2.next());
		}
	}

}

package array_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TraverseDemo {
	public static void main(String[] args) {
		ArrayList<String> languages= new ArrayList<String>();
		languages.add("JAVA");
		languages.add("Python");
		languages.add("C");
		languages.add("C++");
		
		//for each -- > only forward direction
		for(String s: languages)
		{
			System.out.println(s);
		}
		
		System.out.println("===========================================");
		
		//iterator--> only traverse forward
		Iterator<String> itr= languages.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("================================================");
		
		
		//list iterator --> traverse forward and backward
		ListIterator<String> itr2=languages.listIterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
		System.out.println("========================================");
		while(itr2.hasPrevious())
		{
			System.out.println(itr2.previous());
		}
	}

}

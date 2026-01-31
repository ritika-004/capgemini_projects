package sorted_Set;

import tree_Set.*;
import java.util.SortedSet;
import java.util.TreeSet;

public class demo {
	public static void main(String[] args) {
		SortedSet<Integer> ss= new TreeSet<Integer>(new MyIntegerCompare());
		ss.add(100);
		ss.add(30);
		ss.add(40);
		ss.add(50);
		ss.add(60);
		ss.add(10);
		
		System.out.println(ss);
		//first()
		System.out.println("first() : "+ ss.first());
		
		//last()
		System.out.println("last() : "+ ss.last());
		
		//headSet()
		System.out.println("headset() :"+ss.headSet(100));
		
		//tailset()
		System.out.println("tailset() :"+ ss.tailSet(30));
		
		//subset()
		System.out.println("subset() :"+ ss.subSet(40, 10));
		
		//comparator
		System.out.println("Comparator() :"+ ss.comparator());
		
		
	}

}

package tree_Set;

import java.util.TreeSet;

public class ComparatorDemo {
	public static void main(String[] args) {
		TreeSet<Integer> ts= new TreeSet<Integer>(new MyIntegerCompare());
		ts.add(100);
		ts.add(20);
		ts.add(10);
		ts.add(30);
		ts.add(20);
		
		System.out.println(ts);
	}

}

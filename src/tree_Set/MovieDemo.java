package tree_Set;

import java.util.TreeSet;

public class MovieDemo {
	public static void main(String[] args) {
		TreeSet<Movie> ts= new TreeSet<Movie>();
		Movie e1= new Movie(3,"Raj",3);
		Movie e2= new Movie(1,"Ankita",1);
		Movie e3= new Movie(2,"Rohit",1.5);
		Movie e4= new Movie(4,"Rohan",4.5);
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		System.out.println(ts);
	}

}

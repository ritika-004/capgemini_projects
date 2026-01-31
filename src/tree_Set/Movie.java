package tree_Set;

import java.util.Comparator;

public class Movie implements Comparator<Movie>{
	int id;
	String name;
	double rating;
	
	public Movie(int id,String name,double rating)
	{
		this.id=id;
		this.name=name;
		this.rating=rating;
	}
	
	@Override 
	public String toString()
	{
		return "id :"+ id+ ", name :"+ name+ " ,rating : "+ rating;
	}
	
	public int compare(Movie m1,Movie m2)
	{
		if(m1.rating>m2.rating) {
			return -1;
		}
		else if(m1.rating< m2.rating) {
			return 1;
		}
		return 0;
	}

	
	

}

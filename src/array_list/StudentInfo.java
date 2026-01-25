package array_list;

import java.util.ArrayList;

public class StudentInfo {
	
		int id;
		String name;
		double perc;
		
		public StudentInfo(int id,String name,double perc)
		{
			this.id=id;
			this.name=name;
			this.perc=perc;
		}
		
		public String toString()
		{
			return "Student{ id: "+ id + " , name: " +name+ " ,percentage :"+perc+ "}"; 
		}
	}

		
	
package array_list;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList2 {
	public static ArrayList<StudentInfo> getfailed(ArrayList<StudentInfo> data)
	{
		ArrayList<StudentInfo> failed =new ArrayList<StudentInfo>();
		for(StudentInfo s : data)
		{
			if(s.perc<40)
			{
				failed.add(s);
			}
		}
		return failed;
	}
	
	
	
	
	
	public static void main(String[] args) {
		ArrayList<StudentInfo> list =new ArrayList<StudentInfo>();
		list.add(new StudentInfo(1,"Ravi",80.0));
		list.add(new StudentInfo(2,"Pratik",60.0));
		list.add(new StudentInfo(3,"Ram",50.0));
		list.add(new StudentInfo(4,"Sham",30.0));
		list.add(new StudentInfo(5,"Raj",10.0));
		
		
		Iterator<StudentInfo> itr= list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("========================================");
		System.out.println("Failed students : "+ getfailed(list));
	}

}

package array_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Traverse_insert {
	public static void main(String[] args) {
		ArrayList<String> languages= new ArrayList<String>();
		languages.add("JAVA");
		languages.add("Python");
		languages.add("C");
		languages.add("C++");
		
//		for each --> traverse + remove
//		for(String s: languages)
//	{
//		if(s.equals("Python"))
//				languages.add("Ruby);
//		}
		
		//iterator--> only traverse forward
//				Iterator<String> itr= languages.iterator();
//				while(itr.hasNext())
//				{
//					if(itr.next().equals("Python"))
//					{
//						languages.add("Ruby");
//					}
//					
//				}
				System.out.println(languages);
				//list iterator --> traverse forward and backward
				ListIterator<String> itr2=languages.listIterator();
				while(itr2.hasNext()) {
					if(itr2.next().equals("C"))
					{
						itr2.add("Ruby");
					}
				}
				System.out.println(languages);

}
}

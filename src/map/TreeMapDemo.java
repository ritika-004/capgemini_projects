package map;

import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>(new MyIntegerComp());
		tm.put(3,  "India");
		tm.put(1,  "USA");
		tm.put(5,  "China");
		tm.put(1,  "India");
		tm.put(4,  "Brazil");
		
		System.out.println(tm);
		
		System.out.println("================================");
		
		TreeMap<PersonProg, String> tm2 = new TreeMap<PersonProg, String>();
		
		PersonProg p1 = new PersonProg(1, "Anmol", 30);
		PersonProg p2 = new PersonProg(2, "Rahul", 30);
		PersonProg p3 = new PersonProg(3, "Ram", 30);
		PersonProg p4 = new PersonProg(1, "Anmol", 30);
		
		
		tm2.put(p1,  "Maharastra");
		tm2.put(p2,  "Delhi");
		tm2.put(p3,  "Bengal");
		tm2.put(p4,  "MP");
		
		System.out.println(tm2);
		
		
	}

}

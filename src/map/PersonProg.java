package map;

public class PersonProg implements Comparable<PersonProg>{
	int id; 
	String name; 
	int age;
	
	public PersonProg(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Person [id= " + id + ", name=" + name + ", age=" + age + "]";
	}
	
	public int compareTo(PersonProg p) {
		if(this.id > p.id) {
			return -1;
		}
		else if(this.id < p.id) {
			return 1;
		}
		else {
			return 0;
		}
	}

}
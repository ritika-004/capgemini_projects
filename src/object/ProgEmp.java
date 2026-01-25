package object;

public class ProgEmp {
	String name;
	int phone;
	String email;
	
	public ProgEmp(String name, int phone, String email) {
		this.name = name; 
		this.phone = phone;
		this.email = email;
	}
	public boolean equals(Object o) {

        if (o instanceof ProgEmp) {
            ProgEmp other = (ProgEmp) o;
            return this.name.equals(other.name)
                    && this.phone == other.phone
                    && this.email.equals(other.email);
        }

        if (o instanceof ProgStd) {
            ProgStd other = (ProgStd) o;
            return this.name.equals(other.name)
                    && this.phone == other.phone
                    && this.email.equals(other.email);
        }

        return false;     }


	
}
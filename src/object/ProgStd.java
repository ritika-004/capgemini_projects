package object;

public class ProgStd {
	String name;
	int phone;
	String email;
	
	public ProgStd(String name, int phone, String email) {
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


	

    public static void main(String[] args) {
        ProgEmp e1 = new ProgEmp("Vinod", 789452234, "vinod@gmail.com");
        ProgStd s1 = new ProgStd("Vinod", 789452234, "vinod@gmail.com");

        System.out.println(e1.equals(s1)); 
        System.out.println(s1.equals(e1)); 
    }
}
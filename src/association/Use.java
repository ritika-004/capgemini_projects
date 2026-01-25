package association;

public class Use {
	public static void main(String[] args) {
		Person p =new Person();
		p.setAge("20");
		p.setGender("male");
		p.setName("Miller");
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getGender());
		
		System.out.println("passport "+p.getPassport());
		
		p.applyPassport("1","15/09/2004","01-01-2030");
		System.out.println("passport "+p.getPassport());
		
		System.out.println(p.getPassport().getId());
		System.out.println(p.getPassport().getDob());
		System.out.println(p.getPassport().getExpDate());
		
	}

}

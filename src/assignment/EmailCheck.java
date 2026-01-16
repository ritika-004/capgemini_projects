package assignment;

public class EmailCheck {
	public static void main(String[] args) {

        String email = "ritika@gmail.com";

        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        if (email.matches(regex)) {
            System.out.println("Valid Email ID");
        } else {
            System.out.println("Invalid Email ID");
        }
    }

}

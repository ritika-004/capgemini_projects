package string;

public class Prog10 {
	public static void main(String[] args) {
		System.out.println("63456".matches("[6-9]\\d+"));
		System.out.println("6345456759".matches("[6-9]\\d{9}"));  //length has to be  9 for digits d leaving first digit
		System.out.println("63454567289".matches("[6-9]\\d{9,12}"));  //length in range 9 to 12 for digits d
	}
	}



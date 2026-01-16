package string;

public class Prog8 {
	public static void main(String[] args) {
		System.out.println("d".matches("[abc]"));//matches with abc
		System.out.println("d".matches("^[^abc]")); //matches leaving abc
		System.out.println("d".matches("[a-z]"));//within range
		System.out.println("d".matches("[A-Z]"));//single character matching
		System.out.println("Z".matches("[A-Z]"));
		System.out.println("abc".matches("[a-z]+"));//more than one character
		System.out.println("ABC".matches("[A-Z]+"));
		System.out.println("abcABC".matches("[a-zA-Z]+"));
		System.out.println("012".matches("[0-9]+"));//for digits
		System.out.println("abcABC123".matches("[a-zA-Z0-9]+"));
		System.out.println("2".matches("[6-9]"));
		System.out.println("9876543210".matches("[6-9][0-9]+"));
	}

}

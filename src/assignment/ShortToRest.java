package assignment;

public class ShortToRest {
	
	
	public static void main(String[] args) {
	// SHORT
    short s = 100;
    System.out.println("\nShort value: " + s);

    byte b = (byte) s;     // narrowing
    int i = s;
    long l = s;
    float f = s;
    double d = s;
    char c = (char) s;
    
    System.out.println("\nShort to byte: " + b);
    System.out.println("\nShort to int: " + i);
    System.out.println("\nShort to long: " + l);
    System.out.println("\nShort to float: " + f);
    System.out.println("\nShort to double: " + d);
    System.out.println("\nShort to char: " + c);
	}

}

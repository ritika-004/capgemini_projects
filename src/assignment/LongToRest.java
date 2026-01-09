package assignment;

public class LongToRest {
	public static void main(String[] args) {
		// LONG
        long l = 10000L;
        System.out.println("\nLong value: " + l);

	    byte b = (byte) l;    
	    short s = (short)l;
	    int i = (int)l;
	    float f = l;
	    double d = l;
	    char c = (char) l;
	    
	    System.out.println("\nLong to byte: " + b);
	    System.out.println("\nLong to short: " + s);
	    System.out.println("\nLong to int: " + i);
	    System.out.println("\nLong to float: " + f);
	    System.out.println("\nLong to double: " + d);
	    System.out.println("\nLong to char: " + c);
		}

}

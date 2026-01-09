
package assignment;

public class TypeCastingByte{

	    public static void main(String[] args) {

	        // BYTE
	        byte b = 10;
	        System.out.println("Byte value: " + b);

	        short s_from_b = b;           // widening
	        int i_from_b = b;             // widening
	        long l_from_b = b;            // widening
	        float f_from_b = b;           // widening
	        double d_from_b = b;          // widening
	        char c_from_b = (char) b;     // explicit
	        
	        System.out.println("\nByte to Short: " + s_from_b);
	        System.out.println("\nByte to int: " + i_from_b);
	        System.out.println("\nByte to long: " + l_from_b);
	        System.out.println("\nByte to float: " + f_from_b);
	        System.out.println("\nByte to double: " + d_from_b);
	        System.out.println("\nByte to char: " + c_from_b);

	    
	    }
	}




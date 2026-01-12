package assignment;

public class SquareRoot {
	public static void main(String[] args) {

        int num = 9;   
        int sqrt = (int) Math.sqrt(num);

        if (sqrt * sqrt == num)
            System.out.println("Square root exists: " + sqrt);
        else
            System.out.println("Square root does not exist");
    }

}

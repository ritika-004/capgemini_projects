package loops.whileloop;

public class automorphic {
	public static void main(String[] args) {

        int n = 76;   
        int square = n * n;
        int temp = n;
        int count = 0;

        
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int lastDigits = square % (int) Math.pow(10, count);

        if (lastDigits == n)
            System.out.println(n + " is an Automorphic Number");
        else
            System.out.println(n + " is NOT an Automorphic Number");
    }
}

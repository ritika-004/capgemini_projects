package assignment;

public class DiffOfSums {
	public static void main(String[] args) {

        int n = 4;   // divisor
        int m = 20;  // range
        int divSum = 0, nonDivSum = 0;

        for (int i = 1; i <= m; i++) {
            if (i % n == 0)
                divSum += i;
            else
                nonDivSum += i;
        }

        System.out.println("Difference: " + (nonDivSum - divSum));
    }

}

package assignment;

public class TechNumber {
	public static void main(String[] args) {

        int num = 2025;   
        int temp = num;
        int count = 0;

        while (temp > 0) {
            count++;
            temp /= 10;
        }

        if (count % 2 != 0) {
            System.out.println(num + " is NOT a Tech Number");
            return;
        }

        int div = (int) Math.pow(10, count / 2);
        int first = num / div;
        int second = num % div;

        int sum = first + second;

        if (sum * sum == num)
            System.out.println(num + " is a Tech Number");
        else
            System.out.println(num + " is NOT a Tech Number");
    }

}

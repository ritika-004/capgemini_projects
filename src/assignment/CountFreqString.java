package assignment;

public class CountFreqString {
	public static void main(String[] args) {
		String s="hello";
		char[]a=s.toCharArray();
		countFrequency(a);
	}
	static void countFrequency(char[] arr) {

        int n = arr.length;

        System.out.println("Element : Frequency");

        for (int i = 0; i < n; i++) {

            int count = 1;

            
            if (arr[i] == ' ')
                continue;

            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = ' ';   // mark as counted
                }
            }

            System.out.println(arr[i] + " : " + count + " times");
        }
    }


}

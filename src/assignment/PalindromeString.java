package assignment;

public class PalindromeString {
	static String reverseWords(String str) {
        String[] words = str.split(" ");
        String result = "";

        for (String word : words) {
            String rev = "";
            for (int i = word.length() - 1; i >= 0; i--) {
                rev += word.charAt(i);
            }
            result += rev + " ";
        }

        return result.trim();
    }
	public static void main(String[] args) {
		String str = "racecar";
        String output = reverseWords(str);
        if(str.equals(output))
        	System.out.println("Palindrome");
        else
        	System.out.println("not palindrome");
	}

}

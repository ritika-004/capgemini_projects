package assignment;

public class RemoveAdjacentDuplicates {
    public static void main(String[] args) {

        String s = "accddaf";
        String result = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            int len = result.length();
            if (len > 0 && result.charAt(len - 1) == ch) {
                result = result.substring(0, len - 1); // removing last char
            } else {
                result = result + ch; // adding char
            }
        }

        System.out.println(result);
    }
}


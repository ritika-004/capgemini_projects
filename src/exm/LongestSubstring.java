package exm;

import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {

        String s = "abcabcbb";   
        HashSet<Character> set = new HashSet<>();

        int maxLength = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {

            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(start));
                start++;
            }

            set.add(s.charAt(i));
            maxLength = Math.max(maxLength, i- start + 1);
        }

        System.out.println(maxLength);
    }
}

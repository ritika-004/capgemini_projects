package com.uem;

import java.util.HashMap;

public class AnagramCheck {

    static boolean isAnagram(String s1, String s2) {

      
        if (s1.length() != s2.length())
            return false;

        HashMap<Character, Integer> map = new HashMap<>();

      
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);

            if (map.containsKey(ch))
                map.put(ch, map.get(ch) + 1);
            else
                map.put(ch, 1);
        }

        
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);

            if (!map.containsKey(ch))
                return false;

            map.put(ch, map.get(ch) - 1);

            if (map.get(ch) == 0)
                map.remove(ch);
        }

     
        return map.isEmpty();
    }

    public static void main(String[] args) {

        String s1 = "listen";
        String s2 = "silent";

        if (isAnagram(s1, s2))
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}

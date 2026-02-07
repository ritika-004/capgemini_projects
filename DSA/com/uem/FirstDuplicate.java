package com.uem;

import java.util.HashSet;

public class FirstDuplicate {

    static int firstDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i])) {
                return arr[i];   // first duplicate found
            }
            set.add(arr[i]);
        }
        return -1;   // no duplicate
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 3, 2};

        int result = firstDuplicate(arr);

        if (result != -1)
            System.out.println("First duplicate: " + result);
        else
            System.out.println("No duplicate");
    }
}

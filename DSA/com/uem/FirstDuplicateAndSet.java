package com.uem;

import java.util.LinkedHashSet;

public class FirstDuplicateAndSet {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 5, 3, 2};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        Integer firstDuplicate = null;

        for (int i = 0; i < arr.length; i++) {
            if (set.contains(arr[i]) && firstDuplicate == null) {
                firstDuplicate = arr[i];
            }
            set.add(arr[i]);
        }

        System.out.println("First duplicate: " + firstDuplicate);
        System.out.println("Unique set: " + set);
    }
}

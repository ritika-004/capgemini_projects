package com.uem;

class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 45, 60};
        int key = 30;
        int pos = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                pos = i;
                break;
            }
        }

        if (pos != -1)
            System.out.println("Element found at index " + pos);
        else
            System.out.println("Element not found");
    }
}

package com.uem;

class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 7,8,9}; 
        int start = arr[0];
        int end = arr[arr.length -1];

        int expectedSum = (end * (end + 1)) / 2
                        - ((start - 1) * start) / 2;

        int actualSum = 0;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        System.out.println("Missing element = " + (expectedSum - actualSum));
    }
}

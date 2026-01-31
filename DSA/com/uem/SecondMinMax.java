package com.uem;

public class SecondMinMax {
    public static void main(String[] args) {
        int[] a = {5, 1, 9, 3, 7};

        int min = Integer.MAX_VALUE, smin = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE, smax = Integer.MIN_VALUE;

        for (int x : a) {
            // 2nd smallest
            if (x < min) {
                smin = min;
                min = x;
            } else if (x > min && x < smin) {
                smin = x;
            }

           //2nd largest
            if (x > max) {
                smax = max;
                max = x;
            } else if (x < max && x > smax) {
                smax = x;
            }
        }

        System.out.println("2nd Smallest: " + smin);
        System.out.println("2nd Largest: " + smax);
    }
}

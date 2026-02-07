package com.uem;

public class SquareRoot {
    static int findSqrt(int n) {
        int low = 0, high = n;
        int ans = 0;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (mid * mid == n)
                return mid;          
            else if (mid * mid < n) {
                ans = mid;           
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;                  
    }

    public static void main(String[] args) {
        int n = 40;
        System.out.println("Square root = " + findSqrt(n));
    }
}

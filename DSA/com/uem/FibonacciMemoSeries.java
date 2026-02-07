package com.uem;

public class FibonacciMemoSeries {

    static int fib(int n, int[] dp) {
       
        if (n == 0 || n == 1)
            return n;

        
        if (dp[n] != -1)
            return dp[n];

        
        dp[n] = fib(n - 1, dp) + fib(n - 2, dp);
        return dp[n];
    }

    public static void main(String[] args) {
        int n = 10;

        int[] dp = new int[n];

        
        for (int i = 0; i < n; i++) {
            dp[i] = -1;
        }

       
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i, dp) + " ");
        }
    }
}


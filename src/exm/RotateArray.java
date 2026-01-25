package exm;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;
        int n = nums.length;

        k = k % n; 

        // Step 1: Reverse entire array
        reverse(nums, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse remaining elements
        reverse(nums, k, n - 1);

        System.out.println(Arrays.toString(nums));
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}

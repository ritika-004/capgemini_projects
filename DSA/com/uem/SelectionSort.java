package com.uem;

class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {60, 23, 10, 20, 15};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

          
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println("Sorted array:");
        for (int x : arr)
            System.out.print(x + " ");
    }
}

package com.uem;

public class LeftRotate {

    static void leftRotate(int[] arr, int k) {

        int n = arr.length;
       

        int[] temp = new int[n];
        int index = 0;

    //k to n
        for (int i = k; i < n; i++) {
            temp[index++] = arr[i];
        }

        //0 to k
        for (int i = 0; i < k; i++) {
            temp[index++] = arr[i];
        }

       //bring back to arr
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7};
        int k = 3;

        leftRotate(arr, k);

        for (int i=0;i< arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

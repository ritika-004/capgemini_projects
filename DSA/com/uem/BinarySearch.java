package com.uem;

class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10,20,23,30,40,60,70};
        int key = 30;

        int low = 0, high = arr.length - 1;
        int pos = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                pos = mid;
                break;
            } else if (key < arr[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        if (pos != -1)
            System.out.println("Element found at index " + pos);
        else
            System.out.println("Element not found");
    }
}


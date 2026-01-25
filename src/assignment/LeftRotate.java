package assignment;


class LeftRotate {

    static void leftRotate(int[] arr, int k) {

        int n = arr.length;
       

        int[] temp = new int[n];
        int index = 0;

        //elements from k to end
        for (int i = k; i < n; i++) {
            temp[index++] = arr[i];
        }

        //  first k elements
        for (int i = 0; i < k; i++) {
            temp[index++] = arr[i];
        }

        // copy back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }

    public static void main(String[] args) {

        int[] playlist = {1,2,3,4,5,6,7};
        int k = 3;

        leftRotate(playlist, k);

        for (int i=0;i< playlist.length;i++) {
            System.out.print(playlist[i] + " ");
        }
    }
}

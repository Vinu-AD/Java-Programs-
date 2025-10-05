package problemsolving.arrayproblems;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
//        int[] list = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int[] list = {7, 3, 9, 1};
        int d = 9;
        d = d % list.length;
        System.out.println(Arrays.toString(list));
        rotateArray(list, d);
        System.out.println(Arrays.toString(list));
    }

    public static void rotateArray(int[] arr, int d) {
        // Write your code here.
        reverseArray(arr, 0, d-1);
        reverseArray(arr, d, arr.length - 1);
        reverseArray(arr, 0, arr.length - 1);
    }
    private static void reverseArray(int[] arr, int from, int to) {
        while(from < to) {
            int temp = arr[from];
            arr[from] = arr[to];
            arr[to] = temp;
            from++;
            to--;
        }
    }
}

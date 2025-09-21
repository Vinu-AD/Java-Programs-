package problemsolving;

import java.util.Arrays;

public class Sort0s1s2s {
    public static void sort012(int[] arr) {
        // code here
        int left = 0;
        int right = arr.length - 1;
        int curr = 0;
        while(curr <= right) {
            if(arr[curr] == 0) {
                int temp = arr[left];
                arr[left++] = arr[curr];
                arr[curr++] = temp;
            }
            else if(arr[curr] == 1) {
                curr++;
            }
            else {
                int temp = arr[curr];
                arr[curr] = arr[right];
                arr[right--] = temp;
            }
        }
//        System.out.println(left);
//        System.out.println(curr);
//        System.out.println(right);
    }
    public static void sort012Opt2(int[] arr) {
        int zeroes = 0;
        int ones = 0;
        for (int n : arr) {
            if (n == 0) zeroes++;
            else if (n == 1) ones++;
        }
        for (int i = 0; i < arr.length; i++) {
            if(i < zeroes) arr[i] = 0;
            else if(i < zeroes + ones) arr[i] = 1;
            else arr[i] = 2;
        }
    }
    public static void main(String[] args) {
//        int[] arr = {0, 1, 2, 0, 1, 2};
        int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
//        Arrays.sort(arr);
        sort012(arr);
//        sort012Opt2(arr);
        System.out.println(Arrays.toString(arr));
    }
}

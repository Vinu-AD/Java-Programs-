package problemsolving.arrayproblems;

import java.util.Arrays;

public class TappingRainWater {
    public static int maxWater(int[] arr) {
        // code here
        int n = arr.length;
        int[] fill = new int[n];

        int max = arr[0];
        for (int left = 0; left < n; left++) {
            if(arr[left] > max)
                max = arr[left];
            fill[left] = max;
        }
        System.out.println(Arrays.toString(fill));
        max = arr[n - 1];
        for (int right = n - 1; right >= 0; right--) {
            if(arr[right] > max)
                max = arr[right];
            fill[right] = Math.min(max, fill[right]);
        }
        System.out.println(Arrays.toString(fill));
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += fill[i] - arr[i];
        }
        return sum;
    }

    public static void main(String[] ignoredArgs) {
//        int[] arr = {3, 0, 1, 0, 4, 0, 2}; // 10
//        int[] arr = {3, 0, 2, 0, 4}; // 7
//        int[] arr = {1, 2, 3, 4}; // 0
        int[] arr = {2, 1, 5, 3, 1, 0, 4}; // 9
        System.out.println(maxWater(arr));
    }
}

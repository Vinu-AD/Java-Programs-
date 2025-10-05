package problemsolving.arrayproblems;

import java.util.Arrays;
import java.util.HashSet;

public class FindTriplets {
    public static boolean findTriplets(int[] arr) {
        // code here.
        int n = arr.length;
        if(n < 3) return false;
        for(int i = 0; i < n - 2; i++) {
            for(int j = i + 1; j < n - 1; j++) {
                for(int k = j + 1; k < n; k++) {
                    if(arr[i] + arr[j] + arr[k] == 0) return true;
                }
            }
        }
        return false;
    }

    public static boolean findTriplets2(int[] arr) {
        // code here.
        Arrays.sort(arr);
        int n = arr.length;
        if(n < 3) return false;
        for(int i = 0; i < n - 2; i++) {
            int left = i + 1;
            int right = n - 1;
            while(left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if(sum == 0) return true;
                else if(sum < 0) left++;
                else right--;
            }
        }
        return false;
    }

    public static boolean findTriplets3(int[] arr) {
        // code here.
        int n = arr.length;
        if(n < 3) return false;
        for(int i = 0; i < n - 1; i++) {
            HashSet<Integer> set = new HashSet<>();
            for(int j = i + 1; j < n; j++) {
                int third = arr[i] + arr[j];
                if(set.contains(-third)) return true;
                set.add(arr[j]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
//        int[] arr = {-5, 3, 2, -1, 0, 1}; // true
        int[] arr = {1, 2, 3}; // false
//        System.out.println(findTriplets(arr));
        System.out.println(findTriplets2(arr));
        System.out.println(findTriplets3(arr));
    }
}

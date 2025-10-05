package problemsolving.arrayproblems;

import java.util.HashMap;

public class LongestSubarrayWithSumK {
    public static int longestSubarray(int[] arr, int k) {
        // code here
        int res = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if(sum == k) {
                    int len = j + 1 - i;
                    res = Math.max(res, len);
                }
            }
        }
        return res;
    }

    public static int longestSubarray2(int[] arr, int k) {
        // code here
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        int res = 0;
        int currSum = 0;
        for (int i = 0; i < n; i++) {
            currSum += arr[i];
            if (currSum == k)
                res = i + 1;
            else if (map.containsKey(currSum - k)){
                res = Math.max(res, i - map.get(currSum - k));
            }
            if (!map.containsKey(currSum))
                map.put(currSum, i);
        }
        return res;
    }

    public static void main(String[] args) {
//        int[] a = {10, 5, 2, 7, 1, -10}; // 15
        int[] a = {-5, 8, -14, 2, 4, 12}; // -5
//        int[] a = {10, -10, 20, 30}; // 5
//        System.out.println(longestSubarray(a, 15)); // 6
//        System.out.println(longestSubarray(a, -5)); // 5
//        System.out.println(longestSubarray(a, 5)); // 0
//        System.out.println(longestSubarray2(a, 15)); // 6
        System.out.println(longestSubarray2(a, -5)); // 5
//        System.out.println(longestSubarray2(a, 5)); // 0
    }
}

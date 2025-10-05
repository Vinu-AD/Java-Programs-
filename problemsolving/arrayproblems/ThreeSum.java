package problemsolving.arrayproblems;

import java.util.Arrays;
import java.util.HashSet;

public class ThreeSum {
    public static boolean hasTripletSum(int[] arr, int target) {
        // code Here
         for(int i = 0; i < arr.length - 1; i++) {
             HashSet<Integer> set = new HashSet<>();
             for(int j = i + 1; j < arr.length; j++) {
                 int n = target - (arr[i] + arr[j]);
                 if(set.contains(n))
                     return true;

                 set.add(arr[j]);
             }
         }
        return false;
    }
    public static boolean hasTripletSum2(int[] arr, int target) {
        // code Here
        Arrays.sort(arr);
        int n = arr.length;
        for(int i = 0; i < n - 2; i++) {

            int left = i + 1;
            int right = n - 1;
            int second = target - arr[i];
            while(left < right) {
                if(arr[left] + arr[right] == second)
                    return true;
                else if(arr[left] + arr[right] < second) {
                    left++;
                }
                else if(arr[left] + arr[right] > second) {
                    right--;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr1 = {40, 20, 10, 3, 6, 7}; // 24 - false
        int[] arr2 = {1, 4, 45, 6, 10, 8}; // 13 - true
        int[] arr3 = {1, 2, 4, 3, 6, 7}; // 10 - true

//        System.out.println(hasTripletSum(arr1, 24));
//        System.out.println(hasTripletSum(arr2, 13));
//        System.out.println(hasTripletSum(arr3, 10));

        System.out.println(hasTripletSum2(arr1, 24));
        System.out.println(hasTripletSum2(arr2, 13));
        System.out.println(hasTripletSum2(arr3, 10));

    }
}

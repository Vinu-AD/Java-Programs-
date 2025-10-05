package problemsolving.arrayproblems;

import java.util.HashSet;

public class TwoSumPresence {
    static boolean twoSum(int[] arr, int target) {
        // code here
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++) {
            if(set.contains(target - arr[i]))
                return true;

            set.add(arr[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 1, 0, 5};
        int target = 0;
        System.out.println(twoSum(arr, target));
    }
}

package problemsolving.arrayproblems;

import java.util.HashMap;

public class MajorityElement {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        int maxCount = 0;
        for (int num : nums) {
            int get = map.getOrDefault(num, 0);
            map.put(num, get + 1);

            if(get + 1 > maxCount) {
                maxCount = get + 1;
                max = num;
                if(maxCount > nums.length/2) return num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
//        int[] a = {3, 2, 3}; // 3
//        int[] a = {2,2,1,1,1,2,2}; // 2
        int[] a = {6, 5, 5}; // 5
        System.out.println(majorityElement(a));
    }
}
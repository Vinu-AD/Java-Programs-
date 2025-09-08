package problemsolving;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> container = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int n = target - nums[i];
            if(container.containsKey(n)) {
                return new int[]{i, container.get(n)};
            }
            container.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(new TwoSum().twoSum(nums, target)));
    }
}

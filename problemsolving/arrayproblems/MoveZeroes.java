package problemsolving.arrayproblems;

import java.util.Arrays;

public class MoveZeroes {
    private static void moveZeroes(int[] nums) {
        for(int i = 0; i < nums.length; i++)
            if(nums[i] == 0)
                for(int j = i+1; j < nums.length; j++) {
                    if(nums[j] != 0) {
                        final int t = nums[i];
                        nums[i] = nums[j];
                        nums[j] = t;
                        break;
                    }
                }
    }

    private static void moveZeroesOptimized(int[] nums) {
        int pos = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                nums[pos++] = nums[i];
            }
        }
        for (int i = pos; i < nums.length; i++) {
            nums[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
//        moveZeroes(nums);
        moveZeroesOptimized(nums);
        System.out.println(Arrays.toString(nums));
    }
}

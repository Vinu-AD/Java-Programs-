package problemsolving.arrayproblems;

import java.util.Arrays;

public class NextPermutation {
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int left = n - 2;
        while(left >= 0 && nums[left] >= nums[left+1])
            left--;
        if(left >= 0) {
            int i = n - 1;
            while(nums[i] <= nums[left])
                i--;
            int temp = nums[left];
            nums[left] = nums[i];
            nums[i] = temp;
        }
        left++;
        int right = n - 1;
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }

        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 6, 5, 4};
        int[] arr = {6, 5, 4, 3, 2, 1};
        nextPermutation(arr);
    }
}

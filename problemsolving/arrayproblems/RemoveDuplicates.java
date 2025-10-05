package problemsolving.arrayproblems;

import java.util.Arrays;

public class RemoveDuplicates {
    private int removeDuplicates(int[] nums) {
        int pos = 0;
        int ind = 1;
        while(ind < nums.length) {
            if(nums[ind] == nums[pos]) ind++;
            else nums[++pos] = nums[ind++];
        }
        return ++pos;
    }

    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int size = new RemoveDuplicates().removeDuplicates(nums);

        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 0, size)));
    }
}

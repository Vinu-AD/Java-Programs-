package problemsolving;

public class MaximumSubarray {
    private static int maxSubArray(int[] nums) {
        // by kadane's algorithm
        int max = nums[0];
        int curr = max;
        for (int i = 1; i < nums.length; i++) {
            curr = nums[i] > curr + nums[i] ? nums[i] : curr + nums[i];
            max = curr > max ? curr : max;
        }
        return max;
    }
    public static void main(String[] args) {
//        int[] nums = {-2,1,-3,4,-1,2,1,-5,4}; // 6
        int[] nums = {5,4,-1,7,8}; // 23
        System.out.println(maxSubArray(nums));
    }
}

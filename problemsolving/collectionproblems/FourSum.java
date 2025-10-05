package problemsolving.collectionproblems;

import java.util.*;

public class FourSum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        if(n < 4) return list;

        for(int i = 0; i < n - 3; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1; j < n - 2; j++) {
                if(j > i+1 && nums[j] == nums[j-1]) continue;

                int left = j + 1;
                int right = n - 1;
                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        list.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;
                    }
                    else if (sum < target) left++;
                    else if (sum > target) right--;
                }
            }
        }
        return list;
    }

    public static List<List<Integer>> fourSum2(int[] nums, int target) {
        int n = nums.length;
        Arrays.sort(nums);
//        List<List<Integer>> list = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        if(n < 4) return new ArrayList<>();

        for(int i = 0; i < n - 3; i++) {
            if(i > 0 && nums[i] == nums[i-1]) continue;
            for(int j = i+1; j < n - 2; j++) {
                if(j > i+1 && nums[j] == nums[j-1]) continue;

                int left = j + 1;
                int right = n - 1;
                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        set.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));

                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;

                        left++;
                        right--;
                    }
                    else if (sum < target) left++;
                    else if (sum > target) right--;
                }
            }
        }
        return new ArrayList<>(set);
    }

    public static void main(String[] args) {
//        int[] arr = {-5,5,4,-3,0,0,4,-2}; // 4 ->  [[-5,0,4,5],[-3,-2,4,5]]
//        int[] arr = {1,0,-1,0,-2,2}; // 0 -> [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
        int[] arr = {1000000000,1000000000,1000000000,1000000000}; // -294967296 -> []
//        System.out.println(fourSum(arr, 0));
        System.out.println(fourSum2(arr, 0));
    }
}

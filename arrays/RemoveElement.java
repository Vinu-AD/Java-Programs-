package arrays;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        int length = nums.length;
        for(int i = 0; i < length; i++) {
            if(nums[i] == val) {
                for (int k = i; k < length - 1; k++) {
                    nums[k] = nums[k + 1];
                }
                length--;
                i--;
            }
        }
        return length;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,2,2,3,0,4,2};
//        int[] arr = {3,2,2,3};
        int size = removeElement(arr, 3);
        System.out.println("Size: " + size);
        for(int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
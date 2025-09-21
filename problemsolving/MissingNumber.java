package problemsolving;

public class MissingNumber {
    static int missingNum(int arr[]) {
        // code here
        int n = arr.length + 1;
        long total = (long) n * (n + 1) / 2;
        int sum = 0;
        for(int num : arr) {
            sum += num;
        }
        return (int) total - sum;
    }

    static int missingNumXOR(int arr[]) {
        // code here
        int size = arr.length + 1;
        int all = 0;
        int array = 0;
        for(int i = 1; i <= size; i++) all ^= i;
        for(int n : arr) array ^= n;
        return all ^ array;
    }

    public static void main(String[] args) {
//        int[] arr = {8, 2, 4, 5, 3, 7, 1}; // 6
//        int[] arr = {1}; // 2
        int[] arr = {1, 2, 4, 5, 6, 7, 8, 9, 10}; // 3
//        System.out.println(missingNum(arr));
        System.out.println(missingNumXOR(arr));
    }
}

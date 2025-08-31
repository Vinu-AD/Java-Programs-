package arrays;

public class SecondMax {
    public static void main(String[] args) {
        int[] arr = {1, 8, 3, 2, 4, 8, 3, 7}; // 8

        int max = 0;
        int secMax = max;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            }
            else if(arr[i] < max && arr[i] > secMax) {
                secMax = arr[i];
            }
        }
            System.out.println(secMax);
    }
}

package arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {1, 8, 3, 2, 4, 8, 3, 7}; // 8

        int size = arr.length;
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            size--;
        }

        for(int n : arr)
            System.out.print(n + " ");
    }
}

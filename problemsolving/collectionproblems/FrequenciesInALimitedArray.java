package problemsolving.collectionproblems;

import java.util.Arrays;
import java.util.List;

public class FrequenciesInALimitedArray {
    public static List<Integer> frequencyCount(int[] arr) {
        // code here
        Integer[] result = new Integer[arr.length];
        Arrays.fill(result, 0);
        for (int n : arr) {
            result[n-1]++;
        }
        return Arrays.asList(result);
    }
    public static void main(String[] args) {
        int[] arr = {2, 3, 2, 3, 5};
        System.out.println(frequencyCount(arr));
    }
}

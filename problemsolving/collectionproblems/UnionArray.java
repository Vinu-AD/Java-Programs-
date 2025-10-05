package problemsolving.collectionproblems;

import java.util.ArrayList;
import java.util.HashSet;

public class UnionArray {

    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        for (int n : a) set.add(n);
        for (int n : b) set.add(n);
        return new ArrayList<>(set);
    }

    public static void main(String[] ignoredArgs) {

        int[] arr1 = {1, 5, 3, 2};
        int[] arr2 = {0, 0, 0, 0, 0};
        System.out.println(findUnion(arr1, arr2));
    }
}

package problemsolving;

import java.util.HashMap;

public class CheckEqualArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 5, 4, 0};
        int[] arr2 = {2, 4, 5, 0, 1};
        System.out.println(checkEqual(arr1, arr2));
    }
    public static boolean checkEqual(int[] a, int[] b) {
        // code here
        HashMap<Integer, Integer> box = new HashMap<>();
        for(int n : a)
            box.put(n, box.getOrDefault(n, 0) + 1);

        for(int n : b) {
            if(!box.containsKey(n)) return false;
            box.put(n, box.get(n) - 1);
            if(box.get(n) == 0) box.remove(n);
        }
        return box.isEmpty();
    }
}

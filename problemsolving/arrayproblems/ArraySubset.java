package problemsolving.arrayproblems;

import java.util.HashMap;

public class ArraySubset {
    public static boolean isSubset(int[] a, int[] b) {
        // Your code here
        HashMap<Integer, Integer> box = new HashMap<>();
        for(int n : a)
            box.put(n, box.getOrDefault(n, 0) + 1);

        for(int n : b) {
            if (!box.containsKey(n))
                return false;
            else
                box.put(n, box.get(n) - 1);
            if(box.get(n) == 0)
                box.remove(n);
        }
        return true;
    }

    public static void main(String[] ignoredArgs) {
        int[] a1 = {11, 7, 1, 13, 21, 3, 7, 3, 1};
        int[] a2 = {11, 3, 7, 1, 7, 3, 11};

        System.out.println(isSubset(a1,a2));
    }
}

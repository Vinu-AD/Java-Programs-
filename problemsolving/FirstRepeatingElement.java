package problemsolving;

import java.util.HashMap;
import java.util.HashSet;

public class FirstRepeatingElement {
    public static int firstRepeated(int[] arr) {
        // code here
        HashMap<Integer, Integer> aux = new HashMap<>();
        for (int n : arr)
            aux.put(n, aux.getOrDefault(n, 0) + 1);

        for(int i = 0; i < arr.length; i++)
            if(aux.containsKey(arr[i]) && aux.get(arr[i]) > 1)
                return i+1;
        return -1;
    }

    public static int firstRepeated2(int[] arr) {
        // code here
        HashSet<Integer> aux = new HashSet<>();

        int minInd = Integer.MAX_VALUE;
        for(int i = arr.length - 1; i >= 0; i--) {
            if (aux.contains(arr[i]))
                minInd = i;
            aux.add(arr[i]);
        }
        return minInd == Integer.MAX_VALUE ? -1 : minInd + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 3, 5, 6};
//        int n = firstRepeated(arr);
        int n = firstRepeated2(arr);
        System.out.println(n);
        System.out.println(arr[n-1]);
    }

}

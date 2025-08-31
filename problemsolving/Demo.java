package problemsolving;

import java.util.LinkedHashMap;
import java.util.Map;

public class Demo {
    public static void main(String[] args) {
        numberFrequency();
//        sample();
//        Object;
//        Comparator;
//        Throwable;
    }
    private static void sample() {
        String s1 = "java";              // literal
        String s2 = "java";              // literal
        String s3 = new String("java");
        String s4 = new String("java");

        System.out.println(s1 == s2);   // false (different objects)
        System.out.println(s1.equals(s2));
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
    }
    private static void numberFrequency(){
        int[] arr = {2, 3, 5, 2, 3, 5, 9, 8};
        LinkedHashMap<Integer, Integer> f = new LinkedHashMap<>();

        for(int n : arr) {
            f.put(n, f.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> pair : f.entrySet()) {
            System.out.println(pair.getKey() + " : " + pair.getValue());
        }
    }
}

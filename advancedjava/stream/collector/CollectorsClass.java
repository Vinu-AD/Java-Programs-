package advancedjava.stream.collector;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorsClass {
    public static void main(String[] ignoredArgs) {
//        basicMethods();
        toMapMethods();
//        joiningMethod();
    }

    private static void basicMethods() {
        // toList()
        List<Integer> list = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .collect(Collectors.toList());
        System.out.println(list);

        // toSet()
        Set<Integer> set = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .collect(Collectors.toSet());
        System.out.println(set);

        // toCollection()
        ArrayList<Integer> collect = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                .collect(Collectors.toCollection(()->new ArrayList<>()));
        System.out.println(collect);
    }

    private static void toMapMethods() {

        // toMap() -> it will cause IllegalStateException
        String[] str = {"abc", "abc", "abcde", "abcdef"};
//        Map<String, Integer> map = Stream.of(str)
        Map<String, Integer> map = Stream.of("One", "Four", "Twenty")
                .collect(Collectors.toMap(x -> x, y -> y.length()));
        System.out.println(map);

// to overcome the above one
        // toMap() with merge
        Map<Integer, String> map2 = Stream.of(str)
                .collect(Collectors.toMap(y -> y.length(),x -> x,  (x, y) -> x+","+y));
        System.out.println(map2);


    }

    private static void joiningMethod() {
        String join = Stream.of("apple", "banana", "cherry")
                .collect(Collectors.joining(" -> ", "[", "]"));
        System.out.println(join);
    }
}

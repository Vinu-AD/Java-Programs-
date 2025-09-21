package advancedjava.stream;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Stream;

public class IntermediateMethods {
    public static void main(String[] args) {
//        sorted();
//        distinct();
//        limitSkip();
//        flatMapMethodList();
//        flatMapMethodMap();
        flatMapTask();
    }

    private static void sorted() {
        System.out.println("Ascending order");
        Stream.of(2, 9, 5, 9, 1, 4, 6)
                .sorted()
                .forEach(System.out::println);

        System.out.println("Descending order");
        Stream.of(2, 9, 5, 9, 1, 4, 6)
                .sorted((a,b) -> b-a)
                .forEach(System.out::println);
    }

    private static void distinct() {
        System.out.println("Distinct values");
        Stream.of(2, 9, 5, 9, 1, 4, 6, 9, 1, 4, 6)
                .distinct()
                .sorted()
                .forEach(System.out::println);

    }

    private static void limitSkip() {
        Stream.iterate(1, x -> x + 2)
                .skip(2)
                .limit(5)
                .forEach(System.out::println);
    }

    private static void flatMapMethodList() {
        List<String> l1 = Arrays.asList("Alphonse", "Baron", "Cerina", "Deena");
        List<String> l2 = Arrays.asList("Iron Man", "Thor", "Spider Man", "Hulk");

        List<List<String>> list = Arrays.asList(l1, l2);

        list.stream().flatMap(s->s.stream()
                        .sorted(Comparator.reverseOrder()))
                .forEach(System.out::println);

        list.stream().flatMap(s->s.stream().sorted((x,y)->y.compareTo(x))).forEach(System.out::println);
    }

    private static void flatMapMethodMap() {
        Map<Character, String> map = new HashMap<>();
        map.put('C', "Captain America");
        map.put('I', "Iron Man");
        map.put('T', "Thor");
        map.put('H', "Hulk");
        map.put('S', "Spider Man");

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
//                .flatMap(e->e.getValue().toUpperCase())
                .forEach(System.out::println);

        // ==============================================================================

/*        Map<Integer, String> m1 = new HashMap<>();
        m1.put(1, "One");m1.put(2, "Two");m1.put(3, "Three");
        Map<Integer, String> m2 = new HashMap<>();
        m2.put(6, "Six");m2.put(7, "Seven");m2.put(9, "Nine");

        List<Map<Integer, String>> list = Arrays.asList(m1, m2);

        list.stream().flatMap(s->s.entrySet().stream()
                        .sorted((x,y)->y.getValue().compareTo(x.getValue())))
                .forEach(System.out::println);*/
    }

    private static void flatMapTask() {
        String[] wordsList = {"Welcome to Java Java", "The The java is programming language", "Compare to python java is more more readable"};

        Arrays.stream(wordsList)
                .flatMap(s -> Arrays.stream(s.split(" ")))
                .map(x->Character.toUpperCase(x.charAt(0))+x.substring(1))
                .distinct()
                .map(x-> new StringBuilder(x).reverse().toString())
                .forEach(System.out::println);
    }
}

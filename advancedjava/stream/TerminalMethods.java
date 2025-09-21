package advancedjava.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class TerminalMethods {
    public static void main(String[] args) {
//        minMaxMethod();
//        toArrayMethod();
//        toArrayMethod();
        reduce();
    }

    private static void minMaxMethod() {
        Optional<String> min = Stream.of("One", "Two", "Three", "Four", "Five")
                .min(Comparator.naturalOrder());
        min.ifPresent(System.out::println); // lexicographically

        Optional<String> max = Stream.of("One", "Two", "Three", "Four", "Five")
                .max(Comparator.naturalOrder());
        max.ifPresent(System.out::println); // lexicographically

    }

    private static void toArrayMethod() {
        Object[] array = Stream.of(1, 3, 5, 8, 2, 9, 4, 7).toArray();
        System.out.println(Arrays.toString(array));

        Integer[] array2 = Stream.of(1, 3, 5, 8, 2, 9, 4, 7).toArray(Integer[]::new);
        System.out.println(Arrays.toString(array2));
    }

    private static void reduce() {
        int sum = Stream.of(2, 4, 8, 9, 2, 4, 6, 5)
                .reduce(0, Integer::sum);
        System.out.println(sum);

        int prod = Stream.of(2, 4, 8, 9, 2, 4, 6, 5)
                .reduce(1, (x,y)->x*y);
        System.out.println(prod);
    }
}

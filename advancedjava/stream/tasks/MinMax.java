package advancedjava.stream.tasks;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class MinMax {
    public static void main(String[] args) {
        min();
        max();
    }
    private static void min() {
        Integer[] arr = {2, 9, 4, 3, 7, 5, 8, 1, 6};
        System.out.println(Arrays.stream(arr).min(Comparator.naturalOrder()));

        Optional<Integer> collectMin = Arrays.stream(arr)
                .collect(Collectors.minBy(Comparator.naturalOrder()));
        collectMin.ifPresent(System.out::println);

        int reduceMin = Arrays.stream(arr)
                .reduce(arr[0], (x, y) -> x < y ? x : y);
        System.out.println(reduceMin);

    }

    private static void max() {
        Integer[] arr = {2, 9, 4, 3, 7, 5, 8, 1, 6};
        System.out.println(Arrays.stream(arr).max(Comparator.naturalOrder()));

        Optional<Integer> collectMax = Arrays.stream(arr)
                .collect(Collectors.maxBy(Comparator.naturalOrder()));
        collectMax.ifPresent(System.out::println);

        int reduceMax = Arrays.stream(arr)
                .reduce(arr[0], (x, y) -> x > y ? x : y);
        System.out.println(reduceMax);
    }
}

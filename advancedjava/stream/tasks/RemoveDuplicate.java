package advancedjava.stream.tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {
        removeDuplicates1();
        removeDuplicates2();
    }

    private static void removeDuplicates1() {
        List<Integer> num = Arrays.asList(2, 3, 5, 2, 5, 6, 3, 4, 5);

        num = num.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(num);
    }
    private static void removeDuplicates2() {
        List<Integer> num = Arrays.asList(2, 3, 5, 2, 5, 6, 3, 4, 5);

        Set<Integer> n = new HashSet<>(num);
        System.out.println(n);
    }
}

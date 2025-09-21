package advancedjava.stream.tasks;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class AverageOfIntegers {
    public static void main(String[] args) {
        Integer[] nums = {2, 3, 8, 5, 0, 9, 1, 6, 7};
        Double avg = Arrays.stream(nums)
                .collect(Collectors.averagingInt(x -> x));
        System.out.println(avg);

        IntSummaryStatistics summary = Arrays.stream(nums)
                .collect(Collectors.summarizingInt(x -> x));
        System.out.println(summary.getAverage());
    }
}

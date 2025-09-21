package advancedjava.stream;

import java.util.Random;
import java.util.function.Supplier;
import java.util.random.RandomGenerator;
import java.util.stream.Stream;

public class GenerateMethod {
    public static void main(String[] args) {

        Supplier<Integer> nums = () -> new Random().nextInt(1, 100);
        Stream.generate(nums)
                .filter(num -> num > 90)
                .limit(15)
                .forEach(System.out::println);
    }
}

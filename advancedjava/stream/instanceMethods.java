package advancedjava.stream;

import java.util.stream.Stream;

public class instanceMethods {
    public static void main(String[] args) {

        Stream.of("ab", "ABC", "abcd", "ABCDE", "abcdef")
                .mapToInt(String::length)
                .forEach(System.out::println);

        Stream.of("ab", "ABC", "abcd", "ABCDE", "abcdef")
                .mapToDouble(String::length)
                .forEach(System.out::println);

    }
}

package advancedjava.stream;

import java.util.stream.Stream;

public class OfMethod {
    public static void main(String[] args) {
        Stream<String> obs = Stream.of("Adam", "Bob", "cerina", "Devil", "eric");
        Stream<String> s1 = obs.filter(x -> Character.isUpperCase(x.charAt(0)));
        s1.forEach(System.out::println);

        Stream.of("Adam", "Bob", "cerina", "Devil", "eric")
                .filter(x -> Character.isUpperCase(x.charAt(0)))
                .forEach(System.out::println);
    }
}

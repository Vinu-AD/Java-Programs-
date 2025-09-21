package advancedjava.stream.tasks;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class CharacterFrequency {
    public static void main(String[] args) {
        charFrequency();
    }
    public static void charFrequency() {
        String str = "Hello World";

        Map<Character, Long> f = str.chars()
                        .mapToObj(x -> (char)x)
                                .collect(Collectors.groupingBy(
                                        x -> x,
                                        Collectors.counting()
                                ));
        f.forEach((k,v) -> System.out.println(k + " => " + v));

        System.out.println("Alternative...");

        Map<String, Long> s = Arrays.stream(str.split(""))
                .collect(Collectors.groupingBy(
                        x -> x,
                        Collectors.counting()
                ));
        s.forEach((k,v)-> System.out.println(k + " => " + v));
    }
}

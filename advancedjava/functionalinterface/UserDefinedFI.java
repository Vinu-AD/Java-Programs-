package advancedjava.functionalinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

@FunctionalInterface
interface Internet {
    void data();
}

public class UserDefinedFI {
    public static void main(String[] args) {
//        Internet i = () -> System.out.println("Remaining data balance 1gb");
//        i.data();

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Hi", "Hello", "Hello world", "World"));

        names.stream().filter(str -> str.startsWith("H"))
                .map(String::toUpperCase)
                .forEach(System.out::println);

    }
}

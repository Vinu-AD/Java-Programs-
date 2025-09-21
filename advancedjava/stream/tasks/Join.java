package advancedjava.stream.tasks;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Join {
    public static void main(String[] args) {
        joining();
    }
    private static void joining() {
        List<String> names = Arrays.asList("Adam", "Bob", "Cerina", "David");
        String str = names.stream()
                .collect(Collectors.joining(",","[","]"));
        System.out.println(str);

        String str2 = names.stream()
                .collect(Collectors.joining(",", "[", "]"));
        System.out.println(str2);
    }
}

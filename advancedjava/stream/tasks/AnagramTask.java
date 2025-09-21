package advancedjava.stream.tasks;

import java.util.*;
import java.util.stream.Collectors;

public class AnagramTask {
    public static void main(String[] ignoredArgs) {
        anagramSeparation();
    }

    private static void anagramSeparation() {
        String[] str = {"listen", "silent", "enlist", "rat", "tar", "art", "tenet","java", "stream"};

        Map<String, Long> fr = Arrays.stream(str)
                .collect(Collectors.groupingBy(
                        x -> sort(x),
                        Collectors.counting()
                ));

        Map<Boolean, List<String> >res = Arrays.stream(str)
                        .collect(Collectors.partitioningBy(
                                s -> fr.get(sort(s)) > 1
                        ));

        System.out.println("Anagrams => " + res.get(true));
        System.out.println("Not Anagrams => " + res.get(false));
    }

    private static String sort(String s) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
    }
}

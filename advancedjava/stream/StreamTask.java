package advancedjava.stream;

import java.util.*;
import java.util.stream.Stream;

public class StreamTask {
    public static void main(String[] args) {
//        anagramList();
//        palindromeWords();
        primeNumbers();
//        longestString();
//        duplicateValues();
//        commonCharacters();
    }

    private static void anagramList() {
        String[] words = {"listen", "silent", "enlist", "rat", "tar", "art", "tenet","java", "stream"};
        Map<String, List<String>> list = new LinkedHashMap<>();
        Arrays.stream(words)
                .forEach(
                        word -> {
                            String key = sorted(word);
                            list.computeIfAbsent(key, w -> new ArrayList<>()).add(word);
                        }
                );

        list.values().stream()
                .filter(elements -> elements.size() > 1)
                .forEach(System.out::println);
    }
    private static String sorted(String s) {
        char[] letters = s.toCharArray();
        Arrays.sort(letters);
        return new String(letters);
    }

    private static void palindromeWords() {
        String[] words = {"level", "hello", "madam", "world", "noon"};

        Arrays.stream(words)
                .filter(word -> word.equals(new StringBuilder(word).reverse().toString()))
                .forEach(System.out::println);
    }

    private static void primeNumbers() {
        int[]  nums = {2, 3, 4, 5, 10, 11, 15, 17, 1000000};
        Arrays.stream(nums)
                .filter(n -> {
                    if (n == 2 || n== 3) return true;
                    if(n <= 1 || n%2 == 0 || n%3 == 0) return false;
                    for (int i = 5; i * i <= n; i+=6) if (n % i == 0 || n % (i+2) == 0) return false;
                    return true;
                })
                .forEach(System.out::println);
    }

    private static void longestString() {
        String[] words = {"java", "stream", "powerful", "api", "rocks"};

        String longString = Arrays.stream(words)
                .reduce("", (x, y) -> x.length() > y.length() ? x : y);
        System.out.println(longString);
    }

    private static void duplicateValues() {
        int[] nums = {10, 20, 30, 20, 40, 10, 50, 30};
/*        Set<Integer> distinct = new HashSet<>();
        Arrays.stream(nums)
                .filter(n -> !distinct.add(n))
                .forEach(System.out::println);*/

        Arrays.stream(nums)
                .filter(n -> Arrays.stream(nums).filter(x -> x == n).count() > 1)
                .distinct()
                .forEach(System.out::println);
    }

    private static void commonCharacters() {
        String s1 = "stream";
        String s2 = "master";

        Arrays.stream(s1.split(""))
                .filter(c -> s2.contains(c))
                .distinct()
                .forEach(System.out::println);
    }
}

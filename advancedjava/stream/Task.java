package advancedjava.stream;

import java.util.stream.Stream;

public class Task {
    public static void main(String[] args) {

        randomValues();
//        randomValues(20);
//        oddEvenNumbers();
//        namesWithPrefix();
//        upperNames();
//        lowerNames();
    }

    private static void randomValues() {
        System.out.println("10 Random numbers from 1 - 100");
        Stream.generate(() -> Math.round(Math.random()*100+1))
                .limit(10)
                .forEach(System.out::println);
    }

    private static void randomValues(int n) {
        System.out.println("20 Random numbers from 1 - " + n);
        Stream.generate(() -> Math.round(Math.random()*n+1))
                .limit(20)
                .forEach(System.out::println);
    }

    private static void oddEvenNumbers() {
        System.out.println("Odd Even Numbers...");
        Stream.iterate(1, x -> x + 1)
                .limit(50)
                .map(x -> x%2==0 ? x + " - Even" : x + " - Odd")
                .forEach(System.out::println);
    }

    private static void namesWithPrefix() {
        System.out.println("Names with prefix Role_ ");
        Stream.of("Adam", "Bob", "Cerina", "Devil", "Eric")
                .map(x -> "Role_" + x)
                .forEach(System.out::println);
    }

    private static void upperNames() {
        System.out.println("Names in upper case");
        Stream.of("Adam", "Bob", "Cerina", "Devil", "Eric")
                .map(String::toUpperCase)
                .forEach(System.out::println);
    }

    private static void lowerNames() {
        System.out.println("Names in lower case...");
        Stream.of("Adam", "Bob", "Cerina", "Devil", "Eric")
                .map(String::toLowerCase)
                .forEach(System.out::println);
    }

}

package advancedjava.methodreference;

import problemsolving.ConsoleUtil;

import java.util.function.*;

public class InstanceMethodReference {

    boolean isPositive(int a) {
        return a > 0;
    }

    boolean isEqualValue(int a, int b) {
        return a == b;
    }

    void displayName(String name) {
        System.out.println(name);
    }

    void displayNameAndAge(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    String getGreetings() {
        return "Welcome User";
    }

    float addition(int a, int b) {
        return a + b;
    }

    float mul(int x) {
        return x * 10.4f;
    }

    public static void main(String[] args) {
        InstanceMethodReference ob = new InstanceMethodReference();

        Predicate<Integer> f1 = ob::isPositive;
        System.out.println("isPositive: " + f1.test(20));

        BiPredicate<Integer, Integer> f2 = ob::isEqualValue;
        System.out.println("isEqual: " + f2.test(20, 30));

        Consumer<String> f3 = ob::displayName;
        f3.accept("Raja");

        BiConsumer<String, Integer> f4 = ob::displayNameAndAge;
        f4.accept("Raja", 24);

        Supplier<String> f5 = ob::getGreetings;
        System.out.println(f5.get());

        BiFunction<Integer, Integer, Float> f6 = ob::addition;
        System.out.println(f6.apply(20, 30));

        Function<Integer, Float> f7 = ob::mul;
        System.out.println(f7.apply(20));
    }
}

package advancedjava.methodreference;

import java.util.function.*;

public class StaticMethodReference {

    static boolean isPositive(int a) {
        return a > 0;
    }

    static boolean isEqualValue(int a, int b) {
        return a == b;
    }

    static void displayName(String name) {
        System.out.println(name);
    }

    static void displayNameAndAge(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    static String getGreetings() {
        return "Welcome User";
    }

    static float addition(int a, int b) {
        return a + b;
    }

    static float mul(int x) {
        return x * 10.4f;
    }

    public static void main(String[] args) {
//        InstanceMethodReference ob = new InstanceMethodReference();

        Predicate<Integer> f1 = StaticMethodReference::isPositive;
        System.out.println("isPositive: " + f1.test(20));

        BiPredicate<Integer, Integer> f2 = StaticMethodReference::isEqualValue;
        System.out.println("isEqual: " + f2.test(20, 30));

        Consumer<String> f3 = StaticMethodReference::displayName;
        f3.accept("Raja");

        BiConsumer<String, Integer> f4 = StaticMethodReference::displayNameAndAge;
        f4.accept("Raja", 24);

        Supplier<String> f5 = StaticMethodReference::getGreetings;
        System.out.println(f5.get());

        BiFunction<Integer, Integer, Float> f6 = StaticMethodReference::addition;
        System.out.println(f6.apply(20, 30));

        Function<Integer, Float> f7 = StaticMethodReference::mul;
        System.out.println(f7.apply(20));
    }
}

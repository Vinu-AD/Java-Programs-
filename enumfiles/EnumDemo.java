package enumfiles;

import java.util.Arrays;
import java.util.Scanner;

interface EnumFI {
    void dayOfTheWeek();
}

enum Day implements EnumFI {
    MONDAY("One", 1, '1'), TUESDAY("Two"), WEDNESDAY("Three"), SUNDAY, FRIDAY(5);

    public String val;
    public int num;

    Day(){}
    Day(int num){
        this.num = num;
    }
    Day(String val) {
        this.val = val;
    }
    Day(String val, int i, char c) {
        this.val = val;
    }

    public String getVal() {
        return val;
    }
    public int getNum() {
        return num;
    }

    // abstract method (must be implemented by each constant)
//    public abstract int apply(int a, int b);

    @Override
    public void dayOfTheWeek() {
        System.out.println(Arrays.toString(Day.values()));
    }
}

enum Operation {
    ADD {
        public int apply(int a, int b) { return a + b; }
    },
    SUBTRACT {
        public int apply(int a, int b) { return a - b; }
    },
    MULTIPLY {
        public int apply(int a, int b) { return a * b; }
    };

    // abstract method (must be implemented by each constant)
    public abstract int apply(int a, int b);

    enum New {
        NEW_CONSTANT;
    }
}

public class EnumDemo {

    // We can declare Enum inside Enum also
    // We can declare Enum inside class also
    enum New {
        NEW_CONSTANT
    }

    public static void aboutEnum() {
        System.out.println("""
                Declared with enum keyword.
                Enum constants are public, static, final and type-safe.
                Each constant is a singleton object of the enum type.
                Enums cannot extend a class (they already extend java.lang.Enum).
                Enums can implement interfaces.
                Enum constructors are always private (called automatically).
                Enum can have fields, methods, and multiple constructors.
                Enum constants can have different constructor arguments.
                Can be used in switch statements.
                Provides built-in methods:
                values(), valueOf(), ordinal(), name(), toString(), compareTo().
                Enums can have constant-specific methods (abstract + override per constant).
                Enums can be used with EnumSet and EnumMap (special collections).
                Enum constants can be compared safely with ==.
                Enums are automatically serializable.
                Useful in design patterns (Singleton, Strategy).
                Enums can be used in annotations (e.g., @SuppressWarnings(level=...)).""");
    }

    private static void mostlyUsedMethods() {
        Day mon = Day.MONDAY;
        Day sun = Day.SUNDAY;

        System.out.println(mon);
        System.out.println(mon.toString()); // same as the above statement

        for (Day d : Day.values()) { // returns all the objects
            System.out.print(d.ordinal() + " -> " + d);// we'll get the index
            System.out.println(" : " + d.getVal() + " : " + d.getNum()); // given value
        }
        System.out.println(mon.name()); // it returns as String
        System.out.println(Day.valueOf("SUNDAY")); // IAE if not found, otherwise Object returned

        System.out.println(mon.compareTo(sun));
        System.out.println(mon == sun);
        System.out.println(mon.equals(sun));
        System.out.println(mon.equals(Day.MONDAY));

    }

    private static void implementsInterface() {
        Day sun = Day.SUNDAY;
        sun.dayOfTheWeek();
    }

    private static void switchCase() {
        Scanner scan = new Scanner(System.in);
        Day day = Day.valueOf(scan.next().toUpperCase());
        switch (day) {
            case MONDAY -> System.out.println("Monday");
            case TUESDAY -> System.out.println("Tuesday");
            case WEDNESDAY -> System.out.println("Wednesday");
//            case THURSDAY -> System.out.println("Thursday"); we cannot create for non-declared object
            case FRIDAY -> System.out.println("Friday");
            case SUNDAY -> System.out.println("Sunday");
            default -> System.out.println("Thursday or Saturday");
        }
    }

    private static void abstractMethod() {
        System.out.println(Operation.ADD.apply(5, 3));
        System.out.println(Operation.SUBTRACT.apply(5, 3));
        System.out.println(Operation.MULTIPLY.apply(5, 3));
    }

    public static void main(String[] args) {
//        aboutEnum();
        mostlyUsedMethods();
//        implementsInterface();
//        switchCase();
//        abstractMethod();
    }
}

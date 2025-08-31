package wrapperclass;

public class BoxingDemo {
    public static void main(String[] args) {

        // boxing - Converting primitive into Object type
        byte b1 = 127;
        System.out.println("byte: " + b1);
        Byte b2 = Byte.valueOf(b1);
        System.out.println("Byte: " + b2);

        short s1 = 32767;
        System.out.println("short: " + s1);
        Short s2 = Short.valueOf(s1);
        System.out.println("Short: " + s2);

        int i1 = 2147483647;
        System.out.println("int: " + i1);
        Integer i2 = Integer.valueOf(i1);
        System.out.println("Integer: " + i2);

        long l1 = 9223372036854775807L;
        System.out.println("long: " + l1);
        Long l2 = Long.valueOf(l1);
        System.out.println("Long: " + l2);

        float f1 = 9.223372E37f;
        System.out.println("float: " + f1);
        Float f2 = Float.valueOf(f1);
        System.out.println("Float: " + f2);

        double d1 = 9.223372E37;
        System.out.println("double: " + d1);
        Double d2 = Double.valueOf(d1);
        System.out.println("Double: " + d2);

        char c1 = 'V';
        System.out.println("char: " + c1);
        Character c2 = Character.valueOf(c1);
        System.out.println("Character: " + c2);

        boolean b3 = true;
        System.out.println("boolean: " + b3);
        Boolean b4 = Boolean.valueOf(b3);
        System.out.println("Boolean: " + b4);

    }
}

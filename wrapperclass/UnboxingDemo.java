package wrapperclass;

public class UnboxingDemo {
    public static void main(String[] args) {

        // Unboxing - Converting Object into primitive type
        Byte b1 = Byte.valueOf((byte) 127); // boxing
        System.out.println("Byte: " + b1);
        byte b2 = b1.byteValue(); // unboxing
        System.out.println("byte: " + b2);

        Short s1 = Short.valueOf((short) 32767);
        System.out.println("Short: " + s1);
        short s2 = s1.shortValue();
        System.out.println("short: " + s2);

        Integer i1 = Integer.valueOf(2147483647);
        System.out.println("Integer: " + i1);
        int i2 = i1.intValue();
        System.out.println("int: " + i2);

        Long l1 = Long.valueOf(9223372036854775807L);
        System.out.println("Long: " + l1);
        long l2 = l1.longValue();
        System.out.println("long: " + l2);

        Float f1 = Float.valueOf(9.223372E37f);
        System.out.println("Float: " + f1);
        float f2 = f1.floatValue();
        System.out.println("float: " + f2);

        Double d1 = Double.valueOf(9.223372E37);
        System.out.println("Double: " + d1);
        double d2 = d1.doubleValue();
        System.out.println("double: " + d2);

        Character c1 = Character.valueOf('V');
        System.out.println("Character: " + c1);
        char c2 = c1.charValue();
        System.out.println("char: " + c2);

        Boolean b3 = Boolean.valueOf(true);
        System.out.println("Boolean: " + b3);
        boolean b4 = b3.booleanValue();
        System.out.println("boolean: " + b4);

    }
}

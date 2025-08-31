package wrapperclass;

public class AutoBoxing {
    public static void main(String[] args) {

        // Autoboxing - converting primitive to object type automatically
        byte b = 127;
        Byte b2 = 127; // autoboxing
//        Byte b2 = b; // autoboxing
        System.out.println("byte: " + b + "\nByte: " + b2);

        short s = 32767;
        Short s2 = s; // autoboxing
        System.out.println("short: " + s + "\nShort: " + s2);

        int i = 2147483647;
        Integer i2 = i; // autoboxing
        System.out.println("int: " + i + "\nInteger: " + i2);

        long l = 2147483647;
        Long l2 = l; // autoboxing
        System.out.println("long: " + l + "\nLong: " + l2);

        float f = 9.223372E37f;
        Float f2 = f; // autoboxing
        System.out.println("float: " + f + "\nFloat: " + f2);

        double d = 9.223372E307;
        Double d2 = d; // autoboxing
        System.out.println("double: " + d + "\nDouble: " + d2);

        char c = 'V';
        Character c2 = c; // autoboxing
        System.out.println("char: " + c + "\nCharacter: " + c2);

        boolean b3 = true;
        Boolean b4 = b3; // autoboxing
        System.out.println("boolean: " + b3 + "\nBoolean: " + b4);
    }
}

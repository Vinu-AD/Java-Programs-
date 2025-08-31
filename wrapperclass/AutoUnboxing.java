package wrapperclass;

public class AutoUnboxing {
    public static void main(String[] args) {

        // AutoUnboxing - converting Object into primitive type automatically

        Byte b = 127; // autoboxing
        byte b2 = b; // autoUnboxing
        System.out.println("Byte: " + b + "\nbyte: " + b2);

        Short s = Short.MAX_VALUE; //  32767;
        short s2 = s;
        System.out.println("Short: " + s + "\nshort: " + s2);

        Integer i = 2147483647;
        int i2 = i;
        System.out.println("Integer: " + i + "\nint: " + i2);

        Long l = 9223372036854775807L; // Long.MAX_VALUE;
        long l2 = l;
        System.out.println("Long: " + l + "\nlong: " + l2);

        Float f = 3.4028235E38F; // Float.MAX_VALUE;
        float f2 = f;
        System.out.println("Float: " + f + "\nfloat: " + f2);

        Double d = 1.7976931348623157E308; // Double.MAX_VALUE;
        double d2 = d;
        System.out.println("Double: " + d + "\ndouble: " + d2);

        Character c = 'V';
        char c2 = c;
        System.out.println("Character: " + c + "\nchar: " + c2);

        Boolean b3 = true;
        boolean b4 = b3;
        System.out.println("Boolean: " + b3 + "\nboolean: " + b4);

    }
}

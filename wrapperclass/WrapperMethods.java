package wrapperclass;

public class WrapperMethods {
    public static void main(String[] args) {

//        general();
//        integerMethods();
//        doubleMethods();
        characterMethods();

    }

    private static void general() {
        //***Value()

        Integer i = 266;
//        byte b = i.byteValue();
        short s = i.byteValue();
        System.out.println(s);

        // *****.parse***();

        Long l = Long.parseLong("580978");
        System.out.println(l);

        // ob.valueOf();

//        Double d = 4292247; // cannot assign int
        Double d = Double.parseDouble("0297424");
        System.out.println(d);

//        Character c = Character.parseCharacter("V"); use charAt()
        Boolean b2 = Boolean.parseBoolean("TruE"); // true (case-insensitive)
//        Boolean b2 = Boolean.parseBoolean("TrueTrue"); // false otherwise anything
//        Boolean b2 = Boolean.parseBoolean("FalseTrueFalse"); // false otherwise anything
        System.out.println(b2);
    }

    private static void integerMethods() {

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.TYPE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.SIZE);

        Integer i = 100;
        int i1 = 10;

//        System.out.println(i);
        i = Integer.valueOf(i1);

        i1 = i.intValue();
//        System.out.println(i);

//        System.out.println(i.floatValue());
//        System.out.println(i.doubleValue());

//        System.out.println(i.compareTo(10));
//        System.out.println(i.compareTo(15));
//        System.out.println(i.compareTo(5));

//        System.out.println(Integer.parseInt("123"));
//        System.out.println(Integer.parseInt("abc"));  NFE

//        System.out.println(Integer.parseInt("1111", 2));
//        System.out.println(Integer.parseInt("12", 8)); // octal
//        System.out.println(Integer.parseInt("190", 10)); // decimal
//        System.out.println(Integer.parseInt("FF", 16)); // hexadecimal

//        System.out.println(Integer.compare(10, 10)); // 0
//        System.out.println(Integer.compare(15, 10)); // 1
//        System.out.println(Integer.compare(10, 15)); // -1
//        System.out.println(i.compareTo(15)); // -1
//        System.out.println(i.equals(10)); // true
//        System.out.println(i.equals(15)); // false

//        System.out.println(Integer.min(5, 8)); // 5
//        System.out.println(Integer.max(5, 8)); // 8
//        System.out.println(Integer.sum(3, 7)); // 10

//        System.out.println(Integer.toString(10));
//        System.out.println(Integer.toString(15, 2)); // binary
//        System.out.println(Integer.toString(10, 8)); // octal
//        System.out.println(Integer.toString(10, 10)); // decimal
//        System.out.println(Integer.toString(10, 16)); // hexadecimal

//        System.out.println(Integer.toBinaryString(15)); // 1111
//        System.out.println(Integer.toOctalString(10)); // 12
//        System.out.println(Integer.toHexString(15)); // f
//        System.out.println(Integer.toHexString(255)); // ff

//        System.out.println(Integer.bitCount(10)); // 2 - 1010
//        System.out.println(Integer.bitCount(15)); // 4 - 1111

//        System.out.println(Integer.highestOneBit(15)); // 8
//        System.out.println(Integer.lowestOneBit(8)); // 1
//        System.out.println(Integer.lowestOneBit(8)); // 8

//        System.out.println(Integer.numberOfLeadingZeros(12));
//        System.out.println(Integer.numberOfTrailingZeros(12));

    }

    private static void doubleMethods() {

//        System.out.println(Double.MIN_VALUE);
//        System.out.println(Double.MAX_VALUE);
//        System.out.println(Double.SIZE); // 64
//        System.out.println(Long.SIZE); // 64
//        System.out.println(Double.BYTES); // 8
//        System.out.println(Double.TYPE); // double
//        System.out.println(Double.PRECISION); // 53
//        System.out.println(Double.MIN_EXPONENT); // -1022
//        System.out.println(Double.MAX_EXPONENT); // 1023
//        System.out.println(Double.POSITIVE_INFINITY); Infinity
//        System.out.println(Double.NEGATIVE_INFINITY); -Infinity


        Double d = Double.valueOf(10.5);
//        System.out.println(d); // 10.5
//        System.out.println(d.intValue()); // 10
        String s = "15.550000";
//        System.out.println(Double.parseDouble(s)); // 15.55
//        System.out.println(Double.min(10, 20.8));
//        System.out.println(Double.max(10, 15));
//        System.out.println(Double.sum(10.8, 4.2)); // 15.0
//        System.out.println(Double.isInfinite(10.0/0)); // true
//        System.out.println(Double.isFinite(10.0/0)); // false
//        System.out.println(Double.isNaN(0/0.0)); // true

        // need to know
//        System.out.println(Double.doubleToLongBits(1));
//        System.out.println(Double.longBitsToDouble(1));
    }

    private static void characterMethods() {
//        System.out.println(Character.SIZE);
//        System.out.println(Character.BYTES);
//        System.out.println(Character.TYPE);
//        System.out.println(Character.MIN_VALUE);
//        System.out.println(Character.MAX_VALUE);
//        System.out.println(Character.MIN_RADIX);
//        System.out.println(Character.MAX_RADIX);

//        System.out.println(Character.isLetter('3')); // false
//        System.out.println(Character.isLetter('A')); // true

//        System.out.println(Character.isDigit('a')); // false
//        System.out.println(Character.isDigit('9')); // true

//        System.out.println(Character.isLetterOrDigit('$')); // f
//        System.out.println(Character.isLetterOrDigit('9')); // t
//        System.out.println(Character.isLetterOrDigit('v')); // t

//        System.out.println(Character.isAlphabetic('a')); // t
//        System.out.println(Character.isAlphabetic('1')); // f
//        System.out.println(Character.isAlphabetic('%')); // f

//        System.out.println(Character.isWhitespace(' ')); // t
//        System.out.println(Character.isWhitespace('.')); // f

//        System.out.println(Character.isUpperCase('a')); // f
//        System.out.println(Character.isUpperCase('A')); // t

//        System.out.println(Character.isLowerCase('E')); // f
//        System.out.println(Character.isLowerCase('s')); // t

        Character ch = 'V';

//        System.out.println(Character.isTitleCase('a')); // f
//        System.out.println(Character.isTitleCase('H')); //
//        System.out.println(Character.isTitleCase('i')); //

//        System.out.println(Character.isJavaIdentifierStart('_')); // t
//        System.out.println(Character.isJavaIdentifierStart('-')); // f

//        System.out.println(Character.isJavaIdentifierPart('-')); // f
//        System.out.println(Character.isJavaIdentifierPart('8')); // t
//        System.out.println(Character.isJavaIdentifierPart('a')); // t
//        System.out.println(Character.isJavaIdentifierPart('V')); // t
//        System.out.println(Character.isJavaIdentifierPart('$')); // t
//        System.out.println(Character.isJavaIdentifierPart('%')); // f

//        System.out.println(Character.getNumericValue('a')); // 10
//        System.out.println(Character.getNumericValue('f')); // 15
//        System.out.println(Character.getNumericValue('g')); // 16
//        System.out.println(Character.getNumericValue('z')); // 35

//        System.out.println(Character.forDigit(15, 16)); // 'f'
//        System.out.println(Character.forDigit(10, 16)); // 'a'

//        System.out.println(ch.toString().getClass().getName());
    }
}

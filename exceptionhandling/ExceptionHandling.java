package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class ExceptionHandling {

    public static void arithmeticException() {
        try{
            int a = 10;
            int b = 0;
            System.out.println(a/b);
        } catch (ArithmeticException ae) {
            System.out.println("Cannot divisible by zero.");
        }
    }

    public static void nullPointerException() {
        try{
            int[] arr = null;
            System.out.println(arr.length);
        } catch (NullPointerException npe) {
            System.out.println("Define the array before use array's properties");
        }
    }

    public static void negativeArraySizeException() {
        try{
            int[] arr = new int[-1];
        } catch (NegativeArraySizeException nase) {
            System.out.println("Give positive index value to the array");
        }
    }

    public static void arrayIndexOutOfBoundsException() {
        try{
            int[] arr = new int[0];
            arr[0] = 10;
        } catch (ArrayIndexOutOfBoundsException aioobe) {
            System.out.println("Give index value less than the array size");
        }
    }

    public static void stringIndexOutOfBoundsException() {
        try{
            String str = "Hello";
            System.out.println(str.charAt(8));
        } catch (StringIndexOutOfBoundsException sioobe) {
            System.out.println("Give index value less than the String length");
        }
    }

    public static void indexOutOfBoundsException() {
        try{
            String str = "Hi";
            System.out.println(str.charAt(2));
        } catch (IndexOutOfBoundsException ioobe) {
            System.out.println("Give index value less than the length");
        }
    }

    public static void classCastException() {
        try{
            Object ob = new Object();
            StringBuilder s1 = (StringBuilder) ob;
        } catch (ClassCastException cce) {
            System.out.println("Cannot assign parent class object to the child class reference");
        }
    }

    public static void inputMismatchException() {
        try{
            System.out.print("Enter a number: ");
            int value = new Scanner(System.in).nextInt();
            System.out.println("Enter number is: " + value);
        } catch (InputMismatchException ime) {
            System.out.println("Enter integer values only.");
        }
    }

    public static void illegalStateException() {
        try {
            Scanner scan = new Scanner(System.in);
            scan.close();
            scan.nextLine();
        } catch (IllegalStateException ise) {
            System.out.println("We cannot access using the destroyed reference");
        }
    }

    public static void fileNotFoundException() {
        try {
            FileReader fr = new FileReader("");
        } catch (FileNotFoundException fnfe) {
            System.out.println("Check the file path");
        }
    }

    public static void missingFormatArgumentException() {
        try {
            String s = String.format("Number: %s %d", "10");
        } catch (MissingFormatArgumentException mfae) {
            System.out.println("Check the placeholder and Objects count");
        }
    }

    public static void illegalFormatConversionException() {
        try {
            String s = String.format("Number: %d", "10");
        } catch (IllegalFormatConversionException ifce) {
            System.out.println("Enter the proper object to the format specifier ");
        }
    }

    public static void unknownFormatConversionException() {
        try {
            String s = String.format("Number: %q", "10");
        } catch (UnknownFormatConversionException ufce) {
            System.out.println("Check the format specifiers");
        }
    }

    public static void illegalFormatException() {
        try {
            String s = String.format("Number: %s");
        } catch (IllegalFormatException ife) {
            System.out.println("Give proper Object to the placeholders");
        }
    }

    public static void noSuchElementException() {
        try {
            Scanner scan = new Scanner("");
            scan.next();
        } catch (NoSuchElementException nsee) {
            System.out.println("Check out the input values");
        }
    }

    public static void main(String[] args) {

//        arithmeticException(); // 1
//        nullPointerException(); // 2
//        negativeArraySizeException(); // 3
//        arrayIndexOutOfBoundsException(); // 4
//        stringIndexOutOfBoundsException(); // 5
//        indexOutOfBoundsException(); // 6
//        classCastException(); // 7
//        inputMismatchException(); // 8
//        illegalStateException(); // 9
//        fileNotFoundException(); // 10
//        illegalFormatConversionException(); // 11
//        unknownFormatConversionException(); // 12
//        missingFormatArgumentException(); // 13
//        illegalFormatException(); // 14
//        noSuchElementException();  // 15

    }
}

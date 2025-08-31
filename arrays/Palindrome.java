package arrays;

import java.util.Scanner;
class Palindrome {

  static void printArray(char[] arr) {
    for(int i = 0; i < arr.length; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();
  }
  static void palindromeCheck(char[] arr) {
    int start = 0;
    int end = arr.length - 1;
    boolean flag = true;
    while(start < end) {
      if(arr[start] != arr[end]) {
        flag = false;
        break;
      }
      start++;
      end--;
    }
    if(flag) System.out.println("Palindrome");
    else System.out.println("Not a Palindrome");
  }

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.print("Enter the array size: ");
    int size = scan.nextInt();
    char[] arr = new char[size];

    System.out.print("Enter you " + size + " values: ");
    for(int i = 0; i < size; i++)
      arr[i] = scan.next().charAt(0);
    
    System.out.print("Given char Array is: ");
    printArray(arr); 

    palindromeCheck(arr);

  }
}
package arrays;

import java.util.Scanner;

public class ArrayReverse {
	
	static void printArray(int[] arr) {
		int n = arr.length;
		for(int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	static void reverseArray(int[] arr) {
		int start = 0; 
		int end = arr.length - 1;
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		System.out.print("Reversed Array is: ");
		printArray(arr);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the array size: ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		System.out.print("Enter your " + size + " values: ");
		for(int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.print("Original Array is: ");
		printArray(arr);
		reverseArray(arr);
		
		scan.close();
	}

}

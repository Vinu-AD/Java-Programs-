package patterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size: ");
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i >= j) 
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if(i <= j) 
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		scan.close();
	}
}

package patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the size: ");
		int n = scan.nextInt();
		
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i+j <= n-1)
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
				
		for(int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j >= n - i - 1)
					System.out.print("* ");
				else 
					System.out.print("  ");
			}
			System.out.println();
		}
		
		scan.close();
		
	}

}

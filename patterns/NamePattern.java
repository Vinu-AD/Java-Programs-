package patterns;

import java.util.Scanner;

public class NamePattern {
	
	static void vinu(int n) {

		System.out.println();
		for(int i = 0; i < n; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if ((j==0 && i+j<=n/2)||(j==n-1 && i<=n/2)||(i==j+(n/2) || i+j-(n/2)==n-1)) {
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						throw new RuntimeException(e);
					}
					System.out.print("V ");
				}
				else 
					System.out.print("  ");
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (i == 0 || i == n-1 || j == n/2) {
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						throw new RuntimeException(e);
					}
					System.out.print("I ");
				}
				else
					System.out.print("  ");
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (j == 0 || j == n-1 || i == j) {
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						throw new RuntimeException(e);
					}
					System.out.print("N ");
				}
				else 
					System.out.print("  ");
			}
			System.out.print(" ");
			for (int j = 0; j < n; j++) {
				if (j == 0 || i == n-1 || j == n-1) {
					try {
						Thread.sleep(50);
					} catch (InterruptedException e) {
						throw new RuntimeException(e);
					}
					System.out.print("U ");
				}
				else
					System.out.print("  ");
			}
			System.out.println();
		} 
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		vinu(7);
	}

}

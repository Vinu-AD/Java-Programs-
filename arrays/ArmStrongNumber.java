package arrays;

import java.util.Scanner;

public class ArmStrongNumber {
	
	static int digitCount(int n) {
		int count = 0;
		while (n != 0) {
			count++;
			n /= 10;
		}
		return count;
	}
	
	static boolean isArmStrong(int num) {
		int n = num;
		int sum = 0;
		int digit = digitCount(num);
		while (num != 0) {
			sum += Math.pow(num%10, digit);
			num /= 10;
		}
		if(sum == n)
			return true;
 		return false;
	}

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your number: ");
		int num = scan.nextInt();
		
		if(isArmStrong(num)) 
			System.out.println("ArmStrong Number");
		else
			System.out.println("Not an ArmStrongNumber");
		
		scan.close();

	}

}

package patterns;

public class StartPattern {

	public static void main(String[] args) {
		
		/*  n = 6
     *
    ***
   *****
  *******
 *********
***********  // 11
 *********
  *******
   *****
    ***
     *

		 */
		int n = 6;
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++) {
				System.out.print("  ");
			}
			for(int j = 1; j <= i*2-1; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i = 2; i <= n; i++) {
			for(int j = 2; j <= i*2-i; j++) {
				System.out.print("  ");
			}
			for(int j = 2; j <= (n+1-i)*2; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

}

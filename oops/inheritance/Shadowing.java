package oops.inheritance;

import java.util.Scanner;

class Sample {
	Scanner scan = new Scanner(System.in);
	final int a;
	Sample() {
		a = 10;
		System.out.println(a);
	}
	Sample(int n) {
//		this();
		a = scan.nextInt();;
		System.err.println(a);
	}
	void add() {
		System.err.println("ADD");
	}
	void add2() {
		System.out.println("ADD2");
	}
	void add1() {
		System.err.println("ADD1");
	}
}

class Demo extends Sample {
	int a = 20;
	Demo() {
		System.out.println(this.a);
	}
}

public class Shadowing {

	public static void main(String[] args) {
		Sample ob = new Sample(5);
//		ob.add();
//		ob.add1();
		ob.add2();
	}

}

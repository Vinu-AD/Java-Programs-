package oops.inheritance;

class Rider {
	String name = "Vehicle";
	public void start() {
		System.out.println("Ride Starting...");
	}
	
	public void distance(int start, int stop) {
		if(start > stop) {
			start = start + stop;
			stop = start - stop;
			start = start - stop;
		}
		start();
		engine(start, stop);
		
	}
	public void engine(int start, int stop) {
		System.out.println(name + " Started");
		ride(start, stop);
	}
	public void ride(int start, int stop) {
		for(int i = start; i <= stop; i++) {
			System.out.println(i + "km crossed");
		}
		stop();
	}
	
	public void stop() {
		System.out.println(name + " Stopping...");
		System.out.println("Destination Reached.\n");
	}
}

class MTBike extends Rider {
	
	public MTBike(int start, int stop) {
		super.name = "MTBike";
		distance(start, stop);
	}
}

class Duke extends Rider {
	public Duke(int start, int stop) {
		super.name = "Duke";
		distance(start, stop);
	}
	
}

class Car extends Rider {
	public Car(int start, int stop) {
		super.name = "Car";
		distance(start, stop);
	}
	
}

public class Trip {
	
	static int genRandNum() {
		double num = 0;
		num = Math.random() * 200;
		return (int) num;
	}

	public static void main(String[] args) {
//		new MTBike(genRandNum(), genRandNum());
//		new Duke(genRandNum(), genRandNum());
		new Car(genRandNum(), genRandNum());

	}
}
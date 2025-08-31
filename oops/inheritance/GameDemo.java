package oops.inheritance;

class Game {
	
	String game;
	void play() {
		System.out.println("Playing " + game);
	}
	
	void warmUp() {
		System.out.println("Warm up");
	}
	
	public Game() {
		// TODO Auto-generated constructor stub
	}
	
	Game(String game) {
		this.game = game;
		warmUp();
		play();
	}

}

class Work extends Game {
	
	public Work() {
		super("Kabaddi");
	}
	
	void work() {
		System.out.println("Working");
	}
	
	void learning(String skill) {
		System.out.println("Learning " + skill);
	}
}

public class GameDemo {

	public static void main(String[] args) {
		Work ob = new Work();
		ob.learning("Full Stack");
		ob.work();
	}

}

package multithreadingtasks;

class Race extends Thread {
    static boolean won = false;

    public Race(String name) {
        super(name);
    }

    @Override
    public void run() {
        synchronized (this) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            for (int i = 0; i <= 10; i++) {
                if (i == 10 && !won) {
                    won = true;
                    System.out.println(Thread.currentThread().getName() + " is the Winner");
                }
//            System.out.println(Thread.currentThread().getName() + " -> " + i);
            }
        }
    }
}

public class RaceGame {
    public static void main(String[] args) {
        Race racer1 = new Race("Adam");
        Race racer2 = new Race("Bob");
        Race racer3 = new Race("Charlie");
        Race racer4 = new Race("Daniel");
        racer1.start();
        racer2.start();
        racer3.start();
        racer4.start();
    }
}

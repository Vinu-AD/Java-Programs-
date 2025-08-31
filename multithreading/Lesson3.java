package multithreading;

class Game extends Thread {
    @Override
    public synchronized void run() {
        for(int i = 1; i <= 10; i ++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class Lesson3 {
    public static void main(String[] args) {
        Game ff = new Game();
        Game bg = new Game();

        Thread t2 = new Thread(ff);
        Thread t3 = new Thread(bg);

        t2.start();
        t3.start();
    }
}
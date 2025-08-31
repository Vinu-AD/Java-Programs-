package multithreadingtasks;

class Odd extends Thread {
    Odd() {
        super("OddThread");
    }
    @Override
    public void run() {
        for (int i = 1; i <= 20; i+=2) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }
    }
}

class Even extends Thread {
    Even() {
        super("EvenThread");
    }
    @Override
    public void run() {
        for (int i = 0; i <= 20; i+=2) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }
    }
}

public class OddEven {  // task1

    public static void main(String[] args) {
        Odd t1 = new Odd();
        t1.start();

        Even t2 = new Even();
        t2.start();
    }
}

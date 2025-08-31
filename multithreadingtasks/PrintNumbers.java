package multithreadingtasks;

class Print extends Thread {
    static int n = 1;
    private final int MAX = 10;
    public synchronized void run() {
        while(n <= MAX) {
            System.out.println(Thread.currentThread().getName() + " => " + n++);
            try {
                notifyAll();
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        notifyAll();
    }
}

public class PrintNumbers {
    public static void main(String[] args) {
        Print ob = new Print();

        Thread t1 = new Thread(ob);
        t1.setName("First Thread");

        Thread t2 = new Thread(ob);
        t2.setName("Second Thread");

//        Thread t3 = new Thread(ob);
//        t3.setName("Third Thread");

        t1.start();
        t2.start();
//        t3.start();
    }
}

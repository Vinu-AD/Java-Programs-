package multithreading;

public class YieldDemo {
    public static void main(String[] args) {

        Thread th1 = new Thread() {
            public void run() {
                System.out.println("Thread 1");
            }
        };
        Thread th2 = new Thread() {
            public void run() {
                System.out.println("Thread 2");
            }
        };
        Thread th3 = new Thread() {
            public void run() {
                System.out.println("Thread 3");
            }
        };
        Thread th4 = new Thread() {
            public void run() {
                System.out.println("Thread 4");
            }
        };
        th1.yield();
        th1.start();
        th2.setPriority(10);
        th2.start();
        th3.setPriority(1);
        th3.start();
        th4.setPriority(1);
        th4.start();
    }
}

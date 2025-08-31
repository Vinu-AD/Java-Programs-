package multithreading;

class DaemonThread extends Thread {
    @Override
    public void run() {
        System.out.println("Daemon Thread Starting...");
        for (int i = 0; i < 200; i++) {
            System.out.println("Garbage Collector -> " + i);
        }
        System.out.println("Daemon Thread Ended...");
    }
}

public class DaemonThreadTask {

    private static void mainMethod() {
        for(int i = 0; i < 50; i++) {
            System.out.println("Main method -> " + i);
        }
    }

    public static void main(String[] args) {

        System.out.println("Main Thread Starting...");
        DaemonThread t1 = new DaemonThread();
        t1.setDaemon(true);
        t1.start();

        mainMethod();
        System.out.println("Main Thread Starting...");

    }
}

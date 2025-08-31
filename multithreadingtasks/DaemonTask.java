package multithreadingtasks;

class DaemonThread extends Thread {
    int start;
    int end;

    public DaemonThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        for(int i = start; i <= end; i++) {
            System.out.println(Thread.currentThread().getName() + " -> " + i + " [" + start + " - " + end + "]");
        }
    }
}

public class DaemonTask {  // task 7

    public static void main(String[] args) {
        DaemonThread t1 = new DaemonThread(1, 100);
        t1.setName("Normal-1");
        DaemonThread t2 = new DaemonThread(101, 200);
        t2.setName("Normal-2");
        t1.start();
        t2.start();

        DaemonThread t3 = new DaemonThread(600, 800);
        t3.setName("DaemonThread-1");
        DaemonThread t4 = new DaemonThread(801, 1000);
        t4.setName("DaemonThread-2");
        t3.setDaemon(true);
        t4.setDaemon(true);

        t3.start();
        t4.start();


    }
}

package multithreadingtasks;

class ArrayThread extends Thread {
    static int[] array = new int[25];
    static int runner = 1;
    int start;

    public ArrayThread(int start) {
        this.start = start;
    }

    @Override
    public void run() {
        synchronized (this) {
            for (int i = start; i < start + 5; i++) {
                array[i] = runner;
                runner++;
            }
        }
    }
}

public class ArrayFillThread { // task 8

    public static void main(String[] args) {
        ArrayThread t1 = new ArrayThread(0);
        ArrayThread t2 = new ArrayThread(5);
        ArrayThread t3 = new ArrayThread(10);
        ArrayThread t4 = new ArrayThread(15);
        ArrayThread t5 = new ArrayThread(20);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        for(int i = 0; i < 25; i++) {
            System.out.print(ArrayThread.array[i] + " ");
        }
    }
}

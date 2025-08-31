package multithreading;

class Thread1 extends  Thread {
    Thread1(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}
class Thread2 extends Thread {
    Thread2(String name) {
        super(name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}

class MyRunnable1 implements  Runnable {
    @Override
    public void run() {
        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] > max) max = arr[i];
        }
        System.out.println("Maximum value is: " + max);
    }
}

public class ThreadRunnableTask {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1("Gokul Hari");
        Thread2 t2 = new Thread2("Vijay");
        MyRunnable1 ob = new MyRunnable1();
        Thread t3 = new Thread(ob);

        t3.start();
        t1.start();
        t2.start();
    }
}

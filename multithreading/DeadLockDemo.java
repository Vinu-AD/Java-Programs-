package multithreading;

class Sample {

}

class DLThread1 extends Thread {
    Sample lock1;
    Sample lock2;

    public DLThread1(Sample lock1, Sample lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        synchronized (lock1) {
            System.out.println(Thread.currentThread().getName() + " Lock 2");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (lock2) {
            System.out.println(Thread.currentThread().getName() + " Lock 1");
        }
    }
}

class DLThread2 extends Thread {
    Sample lock1;
    Sample lock2;

    public DLThread2(Sample lock1, Sample lock2) {
        this.lock1 = lock1;
        this.lock2 = lock2;
    }

    @Override
    public void run() {
        synchronized (lock2) {
            System.out.println(Thread.currentThread().getName() + " Lock 2");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (lock1) {
            System.out.println(Thread.currentThread().getName() + " Lock 1");
        }
    }
}

public class DeadLockDemo {
    public static void main(String[] args) {
        Sample ob1 = new Sample();
        Sample ob2 = new Sample();

        DLThread1 t1 = new DLThread1(ob1, ob2);
        DLThread2 t2 = new DLThread2(ob1, ob2);

        t1.start();
        t2.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(t1.getState());
        System.out.println(t1.getState());
    }
}

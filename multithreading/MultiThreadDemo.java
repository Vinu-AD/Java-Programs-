package multithreading;

import java.util.Collections;
import java.util.HashMap;
import java.util.concurrent.ConcurrentMap;

class MyThread extends Thread {
    public MyThread(ThreadGroup g, String name) {
        super(g, name);
    }

    @Override
    public synchronized void run() {

        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(getName() + " -> " + Thread.currentThread().getState());
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {

        for (int i = 'a'; i <= 'z'; i++) {
            System.out.println((char)i);
        }
    }
}

public class MultiThreadDemo {

    public static void main(String[] args) {
        
        threadGroup();
//        threadStates();
//        ConcurrentMap;
//        Collections;
    }

    private static void threadStates() {
        Thread t1 = new Thread("T1") {
            @Override
            public void run() {
//                System.out.println(getName() + " ---> moving to waiting state");
                synchronized (this) {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        System.out.println(t1.getName() + " => " + t1.getState());
        t1.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(t1.getName() + " => " + t1.getState());

        Thread t2 = new Thread("T2") {
            @Override
            public void run() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        t2.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(t2.getName() + " => " + t2.getState());

        Thread t3 = new Thread("T3") {
            @Override
            public void run() {
                synchronized (t1) {
                    System.out.println("Released");
                }
            }
        };
        t3.start();
        try {
            Thread.sleep(100)   ;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(t3.getName() + " => " + t3.getState());

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        synchronized (t1) {
            System.out.println(t1.getName() + " => " + t1.getState());
            t1.notify();
        }

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(t1.getName() + " ---> " + t1.getState());
        System.out.println(t2.getName() + " ---> " + t2.getState());
        System.out.println(t3.getName() + " ---> " + t3.getState());

    }

    private static void threadGroup() {
        ThreadGroup g = new ThreadGroup("New");
        MyThread t1 = new MyThread(g, "T1");
        MyThread t2 = new MyThread(g, "T2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getThreadGroup());
        Thread.currentThread().getThreadGroup().list();
        System.out.println(Thread.currentThread().getThreadGroup().activeCount());
//        System.out.println(t2.getThreadGroup());

    }
}


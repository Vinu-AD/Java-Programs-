package multithreading;

/*
ThreadCLass Methods
wait() notify() notifyAll()
start(), run(), getName(), join(), getState(), sleep()

setName(), setPriority(), getPriority(), isAlive()
getThreadGroup()
 */

public class ThreadMethods extends Thread {
    private static Object lock = new Object();

    public static void main(String[] args) {
        tmethod1();
//        staticMethod();
    }

    private static void tmethod1() {
        ThreadMethods t1 = new ThreadMethods();
        ThreadMethods t2 = new ThreadMethods();
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        t1.setName("my thread");
        t2.setName("java thread");
        System.out.println(t1.getName());
        System.out.println(t2.getName());
        Thread t3 = new Thread("new thread");
        System.out.println(t3.getName());
        System.out.println(t3.getPriority());
//        t3.setPriority(8);
        System.out.println(t3.getPriority());
        System.out.println(t2.getPriority());
        System.out.println(t3.getThreadGroup());
        System.out.println(t3.isAlive());//still thread is working or not
        System.out.println(t2);
        System.out.println(t3);
        try {
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("balance continue...");
    }

    private static void staticMethod() {
        System.out.println(Thread.NORM_PRIORITY);//5
        System.out.println(Thread.MIN_PRIORITY);//1
        System.out.println(Thread.MAX_PRIORITY);//10
        Thread t1 = new Thread();
        t1.start();
        t1.setPriority(8); //set btw 1 to 10 otherwise IllegalArgumentException
        //high priority thread will execute first
        //low priority thread will execute last
        //some time priority will not work [work 1/2 and 9/10]
        try {
            System.out.println("waiting few second...");
            Thread.sleep(1000);//1000 - 1 sec
            System.out.println("loading...");
            Thread.sleep(2000);//2000 - 2 sec
            Thread.sleep(500);//500 - 0.5 sec
            System.out.println("done");
            System.out.println(Thread.activeCount()); // 2
            Thread t2 = new Thread();
            t2.start();
            System.out.println(Thread.activeCount()); // 3
            System.out.println(Thread.currentThread()); // main
            System.out.println(Thread.currentThread().getName());
        }catch (InterruptedException e){
            System.out.println(e);
        }
    }

    //sync Method Object Lock
    public synchronized void objectLock() {
        synchronized (lock) {
        }//proper Lock
        //write 5 lines
        synchronized (this) {
            //write 10 lines
            //syn block Object Lock
        }
        //write 5 lines
    }

    //sync Method Class Lock
    public static synchronized void classLock() {
        synchronized (ThreadMethods.class) {
            //syn block class Lock
        }
    }
}
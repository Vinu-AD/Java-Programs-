package multithreading;

class OddNumber extends Thread {
    @Override
    public synchronized void run() {
        for(int i = 1; i <= 10; i += 2) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }
    }
}

class EvenNumber extends Thread {
    @Override
    public synchronized void run() {
        for(int i = 2; i <= 10; i += 2) {
            System.out.println(Thread.currentThread().getName() + " -> " + i);
        }
    }
}

public class Lesson2 {
    public static void main(String[] args) {

        OddNumber odd = new OddNumber();
        EvenNumber even = new EvenNumber();

        Thread t2 = new Thread(odd);
        Thread t3 = new Thread(odd);
        Thread t4 = new Thread(odd);
        Thread t5 = new Thread(even);
        Thread t6 = new Thread(even);
        Thread t7 = new Thread(even);

        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();

    }
}
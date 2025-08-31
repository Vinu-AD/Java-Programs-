package multithreading;

class A {
    synchronized void method1(B ob) {
        System.out.println("Method 1 is executing");
        ob.method4();
    }
    synchronized void method2() {
        System.out.println("Method 2 is executing");
    }
}
class B {
    synchronized void method3(A ob) {
        System.out.println("Method 3 is executing");
//        ob.method2();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    synchronized void method4() {
        System.out.println("Method 4 is executing");
    }
}

class Th1 extends Thread {
    A a;
    B b;

    public Th1(A ob1, B ob2) {
        this.a = ob1;
        this.b = ob2;
    }

    @Override
    public void run() {
        a.method1(b);
    }
}
class Th2 extends Thread {
    A a;
    B b;

    public Th2(A ob1, B ob2) {
        this.a = ob1;
        this.b = ob2;
    }

    @Override
    public void run() {
        b.method3(a);
    }
}

public class DeadLock {
    public static void main(String[] args) {
        A ob1 = new A();
        B ob2 = new B();

        Th1 t1 = new Th1(ob1, ob2);
        t1.setPriority(10);
        Th2 t2 = new Th2(ob1, ob2);
        t2.setPriority(1);

        t1.start();
        t2.start();
    }
}

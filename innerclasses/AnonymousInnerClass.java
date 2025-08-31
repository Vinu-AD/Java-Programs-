package innerclasses;

class Vehicle {
    void start() {
        System.out.println("Vehicle started");
    }
}

interface Bike {
    void start();
}

abstract class Engine {
    abstract void start();
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        thread();
//        runnable();
//        vehicle();
//        bike()
//        engine();

    }

    private static void thread() {
        Thread t = new Thread() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
                System.out.println(Thread.currentThread().getState());
                display();
            }
            private void display() {
                System.out.println("Thread execution completed");
            }
        };
        t.start();
    }

    private static void vehicle() {
        Vehicle car = new Vehicle() {
            @Override
            public void start() {
                System.out.println("Car started");
            }
        };
        car.start();
    }

    private static void bike() {
        Bike bike = new Bike() {
            @Override
            public void start() {
                System.out.println("Bike started");
            }
        };
        bike.start();
    }

    private static void engine() {
        Engine engine = new Engine() {
            @Override
            public void start() {
                System.out.println("Engine started");
            }
        };
        engine.start();
    }

    private static void runnable() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable...");
            }
        };
        Thread t = new Thread(r);
        t.start();
    }
}

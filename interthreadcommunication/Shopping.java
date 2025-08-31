package interthreadcommunication;

class E_Kart {
    int product = 10;
    synchronized void order(int count) {
        if(count <= product) {
            product -= count;
            System.out.println(count + " - Products ordered!!! remaining : " + product);
        }
        else {
            try {
                System.out.println("Waiting...");
                wait();
                System.out.println("Notified");
                wait();
                System.out.println("Second wait notified");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    synchronized void addProduct(int count) {
        product += count;
        System.out.println(count + " - Products added remaining : " + product);
        notify();
//        notifyAll();
    }
}

public class Shopping {
    public static void main(String[] args) {
        E_Kart kart = new E_Kart();
        Thread user1 = new Thread() {
            @Override
            public void run() {
                kart.order(18);
            }
        };
        Thread user2 = new Thread() {
            @Override
            public void run() {
                kart.order(18);
            }
        };
        Thread user3 = new Thread() {
            @Override
            public void run() {
                kart.order(14);
            }
        };
        Thread add = new Thread() {
            @Override
            public void run() {
                kart.addProduct(50);
            }
        };
        Thread add2 = new Thread() {
            @Override
            public void run() {
                kart.addProduct(50);
            }
        };
        user1.start();
//        user2.start();
//        user3.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        add.start();

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        add2.start();

    }
}

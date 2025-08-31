package multithreadingtasks;

class InsufficientStockException extends RuntimeException {
    InsufficientStockException(String msg) {
        super(msg);
    }
}

class Stock {
    static int currentStock = 0;
    void update(int stock) {
        synchronized (Stock.class) {
            if (stock < 10 && stock > 100) throw new InvalidValueException("Provide stock greater than 0");
            else {
                currentStock += stock;
                System.out.println(Thread.currentThread().getName() + " -> added: " + stock);
                System.out.println("Current stock: " + currentStock);
                System.out.println();
            }
        }
    }

    void get(int stock) {
        synchronized (Stock.class) {
            if (stock < 1 && stock > 200) throw new InvalidValueException("Provide stock between 1 - 200");
            if (stock > currentStock) throw new InsufficientStockException("Provide value less than " + currentStock);
            else {
                currentStock -= stock;
                System.out.println(Thread.currentThread().getName() + " -> got: " + stock);
                System.out.println("Available stock: " + currentStock);
                System.out.println();
            }
        }
    }
}

class Update extends Thread {
    int stock;
    Update(int stock) {
        this.stock = stock;
    }
    @Override
    public synchronized void run() {
        new Stock().update(this.stock);
    }
}

class Get extends Thread {
    int stock;
    Get(int stock) {
        this.stock = stock;
    }
    @Override
    public synchronized void run() {
        new Stock().get(this.stock);
    }
}

public class StockMarket {
    public static void main(String[] args) {
        Update t1 = new Update(100);
        t1.start();
        Update t2 = new Update(80);
        t2.start();
        Update t3 = new Update(90);
        t3.start();
        Update t4 = new Update(70);
        t4.start();
        Update t5 = new Update(90);
        t5.start();
        Update t6 = new Update(80);
        t6.start();

        Get t7 = new Get(50);
        t7.start();
        Get t8 = new Get(150);
        t8.start();
//        Get t9 = new Get(120);
//        t9.start();
    }
}

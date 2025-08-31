package multithreadingtasks;

import java.util.Scanner;

class Table extends Thread {
    int num;

    public Table(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        synchronized (Table.class) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " * " + this.num + " = " + i * this.num);
            }
            System.out.println("===============================");
        }
    }
}

public class PrintTables {  // task 2

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] tables = new int[5];

        for (int i = 0; i < tables.length; i++) {
            System.out.println("Enter table number: ");
            tables[i] = scan.nextInt();
        }

        Table table1 = new Table(tables[0]);
        Table table2 = new Table(tables[1]);
        Table table3 = new Table(tables[2]);
        Table table4 = new Table(tables[3]);
        Table table5 = new Table(tables[4]);

        table1.start();
        table2.start();
        table3.start();
        table4.start();
        table5.start();



        /*for(int i = 0; i < 5; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Enter value " + (i+1) + ": ");

            Table table1 = new Table(scan.nextInt());
            table1.start();
        }*/
    }
}

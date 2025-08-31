package commontask;

class ArrayFill extends Thread {
    static int[] ar = new int[25];
    static int runner = 1;

    void updateArray(int start,int count) {
        synchronized (this) {
        for (int i = start; i < start+5; i++) {
            ar[i] = runner++;
        }
        }
    }
}
class Update extends Thread{
    ArrayFill af;
    int start;
    int count;
    public Update(ArrayFill af,int start,int count){
        this.af = af;
        this.start = start;
        this.count = count;
    }
    public  void run(){
        af.updateArray(start,count);
    }
}

public class Temp { // Vijay's doubt

    public static void main(String[] args) {
        ArrayFill af = new ArrayFill();

        Thread t1 = new Update(af,0,10);
        Thread t2 = new  Update(af,5,10);
        Thread t3 = new  Update(af,10,10);
        Thread t4 = new  Update(af,15,10);
        Thread t5 = new  Update(af,20,10);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        for(int n : ArrayFill.ar)
            System.out.print(n + " ");

    }
}
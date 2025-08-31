package multithreadingtasks;

class PrimeNumber extends Thread {
    int num;
    PrimeNumber(int num) { this.num = num; }
    @Override
    public void run() {
        boolean divided = false;
        for(int i = 2; i <= num / 2; i++) {
            if(num % i == 0) {
                divided = true;
                break;
            }
        }
        if(divided) System.out.println("Given number " + num + " is not a Prime Number");
        else System.out.println("Given number " + num + " is a Prime Number");
    }
}

class Fibonacci extends Thread {
    int terms;
    public Fibonacci(int terms) {
        this.terms = terms;
    }
    @Override
    public void run() {
        if(terms < 1) throw new InvalidValueException("Provide value > 0");
        System.out.print("Fibonacci series ("+terms+" terms) are: ");
        if(terms == 1) {
            System.out.println("0");
        }
        else if(terms == 2) {
            System.out.println("0 1");
        }
        else {
            int curr = 1;
            int prev = 0;
            int sum = 0;
            System.out.print("0 1 ");
            for(int i = 3; i <= terms; i++) {
                sum = curr + prev;
                System.out.print(sum + " ");
                prev = curr;
                curr = sum;
            }
        }
        System.out.println();
    }
}

class MaxElement extends Thread {
//    int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8};
    int[] arr;

    public MaxElement(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++)
            if(arr[i] > max)
                max = arr[i];

        System.out.println("Maximum number in the given array is: " + max);
    }
}

class DupElement extends Thread {
//    int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8};
    int[] arr;
    public DupElement(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
//        int dup = -1;
        System.out.print("Duplicate Elements are :  [ ");
        for (int i = 0; i < arr.length - 1; i++) {
            boolean dupFound = false;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    System.out.print(arr[i] + ", ");
//                    System.out.println("First Duplicate Element is: " + arr[i]);
//                    dupFound = true;
//                    break;
                }
            }
//            if(dupFound) break;
        }
        System.out.println("]");
    }
}

class Sort extends Thread {
//    int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8};
    int[] arr;
    public Sort(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        int size = arr.length;
        for (int i = 0; i < size; i++) {
            boolean swapped = false;
            for(int j = 0; j < size - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped =  true;
                }
            }
            if(!swapped) break;
        }
        System.out.print("Sorted array is : ");
        for(int n : arr) System.out.print(n + " ");
    }
}

public class MultiProblemThread { // task 6

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0, 2, 8, 9, 4};
        PrimeNumber prime = new PrimeNumber(17);
        Fibonacci fibo = new Fibonacci(10);
        MaxElement max = new MaxElement(arr);
        DupElement dup = new DupElement(arr);
        Sort sort = new Sort(arr);

        try {
            prime.start();
            prime.join();

            fibo.start();
            fibo.join();

            max.start();
            max.join();

            dup.start();
            dup.join();

            sort.start();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

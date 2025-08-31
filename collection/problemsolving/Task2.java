package collection.problemsolving;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    static Scanner scan = new Scanner(System.in);
    static ArrayList<Integer> list = new ArrayList<>();
    public static void start() {
        while(true) {
            printList();
            options();
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    maximum();
                    break;
                case 2:
                    minimum();
                    break;
                case 3:
                    sum();
                    break;
                case 4:
                    average();
                    break;
                case 5:
                    removeEven();
                    System.out.print("After removing even numbers: ");
                    for (Integer i : list)
                        System.out.print(i + " ");
                    System.out.println();
                    break;
                case 6:
                    System.out.println("Thank you...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter the correct option: ");
            }
        }
    }

    private static void maximum() {
        int max = Integer.MIN_VALUE;
        for(Integer i : list)
            if(i > max)
                max = i;
        System.out.println("Maximum number is : " + max);
    }

    private static void minimum() {
        int min = Integer.MAX_VALUE;
        for(Integer i : list)
            if(i < min)
                min = i;
        System.out.println("Minimum number is : " + min);
    }

    private static void sum() {
        int sum = 0;
        for(Integer i : list)
            sum += i;
        System.out.println("Sum of the numbers is : " + sum);
    }

    private static void average() {
        int sum = 0;
        for(Integer i : list)
            sum += i;
        System.out.println("Average of the numbers is : " + (double)sum / list.size());
    }

    private static void removeEven() {
        for (int i = 0; i < list.size(); i++)
            if(i % 2 == 0)
                list.remove(i);
    }

    public static void options() {
        System.out.println("1. Maximum Number");
        System.out.println("2. Minimum Number");
        System.out.println("3. Sum of all Numbers");
        System.out.println("4. Average of the Numbers");
        System.out.println("5. Remove even Numbers");
        System.out.println("6. Exit");
        System.out.print("Enter your choice: ");
    }

    public static void printList() {
        System.out.println("------------------------");
        for( Integer i : list)
            System.out.print(i + " ");
        System.out.println();
        System.out.println("------------------------");
    }

    public static void getValues() {
        int n = 5;
        System.out.printf("Enter %d integer values: ", n);
        for (int i = 0; i < n; i++) {
            list.add(scan.nextInt());
            scan.nextLine();
        }
    }
    public static void main(String[] args) {
        getValues();
        start();
    }
}

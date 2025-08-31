package projects;

import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scan = new Scanner(System.in);

        int start = 1;
        int end = 100;
        int chances = 5;
        int randomNumber = random.nextInt(start, end+1);

        System.out.println("Enter your guessing number from " + start + " to " + end + " for " + chances + " chances");

        for(int i = 1; i <= chances; i++) {
            System.out.print("Enter your chance " + i + " value: ");
            int userInput = scan.nextInt();

            if(userInput >= start && userInput <= end) {
                if(i == chances) {
                    if (userInput == randomNumber) {
                        System.out.println("\uD83C\uDFC6Congratulation! You find it");
                        break;
                    }
                    else {
                        System.err.println("Sorry!, your chances are completed");
                    }
                }
                else if(userInput == randomNumber) {
                    System.out.println("Congratulation! You find it");
                    break;
                }
                else if(userInput > randomNumber) System.err.println("\nEnter value below " + userInput);
                else System.err.println("\nEnter value above " + userInput);
            }
            else System.err.println("Enter a valid number from " + start + " to " + end);

        }
        System.out.println("Your number is: " + randomNumber);

    }
}

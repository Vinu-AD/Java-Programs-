package projects;

import java.util.Scanner;

public class TicTacToe {

    private static Scanner scan = new Scanner(System.in);

    static int dim;
    static char[][] board;
    static boolean[][] marked;
    static String name1;
    static String name2;
    static String winner = "";

    private static void getDetails() {


        while (true) {
            System.out.print("Enter the board dimension: ");
            while (!scan.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number:");
                scan.nextLine();
            }
            dim = scan.nextInt();
            scan.nextLine();
            if(dim < 3) System.out.println("Please enter a value greater than 2.");
            else if (dim > 20) {
                System.out.println("Entered dimension: " + dim);
                System.out.println("Screen is not sufficient to play!");
                System.out.println("Enter smaller dimension(<=20)");
            }
            else if(dim >= 10) {
                System.out.println("It is too hard to play and takes much time");
                System.out.println("And also screen is not sufficient to view");
                System.out.println("Do you want to continue?");
                System.out.print("1. Yes\n2. No\nEnter: ");
                while (!scan.hasNextInt()) {
                    System.out.print("Invalid input. Please enter a number:");
                    scan.nextLine();
                }
                int n = scan.nextInt();
                scan.nextLine();
                if(n == 1) break;
                else if(n != 2){
                    System.out.println("Enter valid option.");
                }
            }
            else break;
        }

        board = new char[dim][dim];
        marked = new boolean[dim][dim];

        // Filling board with space character for empty look
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                board[i][j] = ' ';
            }
        }
        // players name
        System.out.print("Enter player 1 name: ");
        name1 = scan.nextLine();
        while(true) {
            System.out.print("Enter player 2 name: ");
            name2 = scan.nextLine();
            if(name2.equals(name1)) {
                System.out.println("Enter different name");
            }
            else break;
        }
    }

    private static void printBoard(char[][] arr) {

        System.out.print("  ");
        for(int i = 1; i <= dim; i++) System.out.printf("  %02d", i);
        System.out.println();

        System.out.print("   \u250C");
        for(int first = 0; first < dim - 1; first++) {
            System.out.print("\u2500\u2500\u2500\u252C");
        }
        System.out.print("\u2500\u2500\u2500\u2510\n");

        for (int i = 0; i < dim; i++) {

            System.out.printf("%02d ", i+1);

            System.out.print("\u2502");
            for (int j = 0; j < dim; j++) {
                System.out.print(" " + arr[i][j] + " ");
                System.out.print("\u2502");
            }
            System.out.println();

            if (i != dim - 1) {
                System.out.print("   \u251C");
                for (int mid = 0; mid < dim - 1; mid++) {
                    System.out.print("\u2500\u2500\u2500\u253C");
                }
                System.out.print("\u2500\u2500\u2500\u2524\n");
            }
            else {
                System.out.print("   \u2514");
                for(int last = 0; last < dim - 1; last++) {
                    System.out.print("\u2500\u2500\u2500\u2534");
                }
                System.out.print("\u2500\u2500\u2500\u2518");
            }
        }
        System.out.println();
    }

    private static String evaluate(char[][] arr, String name1, String name2) {
        int n = arr.length;
        char ch;
        boolean win;

        // Check rows
        for (int i = 0; i < n; i++) {
            ch = arr[i][0];
            if (ch == ' ') continue;
            win = true;
            for (int j = 1; j < n; j++) {
                if (arr[i][j] != ch) {
                    win = false;
                    break;
                }
            }
            if (win) return ch == 'X' ? name1 : name2;
        }

        // columns check
        for (int i = 0; i < n; i++) {
            ch = arr[0][i];
            if (ch == ' ') continue;
            win = true;
            for (int j = 1; j < n; j++) {
                if (arr[j][i] != ch) {
                    win = false;
                    break;
                }
            }
            if (win) return ch == 'X' ? name1 : name2;
        }

        //  left diagonal check
        ch = arr[0][0];
        if (ch != ' ') {
            win = true;
            for (int i = 1; i < n; i++) {
                if (arr[i][i] != ch) {
                    win = false;
                    break;
                }
            }
            if (win) return ch == 'X' ? name1 : name2;
        }

        //  right diagonal check
        ch = arr[0][n - 1];
        if (ch != ' ') {
            win = true;
            for (int i = 1; i < n; i++) {
                if (arr[i][n - 1 - i] != ch) {
                    win = false;
                    break;
                }
            }
            if (win) return ch == 'X' ? name1 : name2;
        }

        return "";
    }

    private static void play() {

        int moves = 0;
        String currentPlayer = name1;

        while (moves < dim * dim) {
            System.out.println("\nCurrent board:");
            printBoard(board);

            System.out.print("Turn: " + currentPlayer + " ");
            System.out.println(currentPlayer.equals(name1) ? "(X)" : "(O)");

            System.out.print("Enter row (1-" + (dim) + "): ");
            while (!scan.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number:");
                scan.nextLine();
            }
            int x = scan.nextInt() - 1;

            System.out.print("Enter column (1-" + (dim) + "): ");
            while (!scan.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number:");
                scan.nextLine();
            }
            int y = scan.nextInt() - 1;

            if (x < 0 || x >= dim || y < 0 || y >= dim) {
                System.out.println("Invalid position. Try again.");
                continue;
            }

            if (marked[x][y]) {
                System.out.println("That spot is already filled. Try again.");
                continue;
            }

            board[x][y] = currentPlayer.equals(name1) ? 'X' : 'O';
            marked[x][y] = true;
            moves++;

            String result = evaluate(board, name1, name2);
            if (!result.isEmpty()) {
                winner = result;
                break;
            }

            currentPlayer = currentPlayer.equals(name1) ? name2 : name1;
        }
        scan.nextLine();
    }

    private static void result() {

        System.out.println("\n======================= RESULT =======================");
        printBoard(board);
        System.out.println("X - " + name1);
        System.out.println("O - " + name2 + "\n");

        if (winner.isEmpty()) {
            System.out.println("Match draw!");
        } else {
            System.out.println("Congratulations, \"" + winner + "\" won the game!");
        }

        System.out.println("========================================================");
    }

    private static void start() {
        while(true) {
            getDetails();
            play();
            result();

            System.out.println("Do you want to play again?\n1. Yes\n2. No");
            boolean playAgain = true;
            while(true) {
                System.out.print("Enter: ");
                while (!scan.hasNextInt()) {
                    System.out.print("Invalid input. Please enter a number:");
                    scan.nextLine();
                }
                int n = scan.nextInt();
                scan.nextLine();
                if (n == 1) {
                    System.out.println("========================================================");
                    break;
                } else if (n == 2) {
                    System.out.println("Thank you!");
                    playAgain = false;
                    break;
                } else System.out.println("Enter a valid option.");
            }
            if(!playAgain) break;
        }
    }

    public static void main(String[] args) {
        start();
    }
}

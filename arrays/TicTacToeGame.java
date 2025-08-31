package arrays;

import java.util.Scanner;

class TicTacToeGame {

    static Scanner scan = new Scanner(System.in);

    static void printArray(char[][] arr) {
        for (char[] row : arr) {
            for (char c : row) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static String evaluate(char[][] arr, String name1, String name2) {
        int n = arr.length;
        char ch;
        boolean win;

        // Check rows
        for (int i = 0; i < n; i++) {
            ch = arr[i][0];
            if (ch == '-') continue;
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
            if (ch == '-') continue;
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
        if (ch != '-') {
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
        if (ch != '-') {
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

    public static void main(String[] args) {
        // players opinion
        System.out.print("Enter the board dimension: ");
        int dim = scan.nextInt();
        scan.nextLine();

        char[][] board = new char[dim][dim];
        boolean[][] marked = new boolean[dim][dim];

        // Filling board with '-' for empty look
        for (int i = 0; i < dim; i++) {
            for (int j = 0; j < dim; j++) {
                board[i][j] = '-';
            }
        }

        // players name
        System.out.print("Enter player 1 name: ");
        String name1 = scan.nextLine();
        System.out.print("Enter player 2 name: ");
        String name2 = scan.nextLine();

        int moves = 0;
        String currentPlayer = name1;
        String winner = "";

        while (moves < dim * dim) {
            System.out.println("\nCurrent board:");
            printArray(board);

            System.out.print(currentPlayer + "'s turn ");
            System.out.println(currentPlayer.equals(name1) ? "(X)" : "(O)");

            System.out.print("Enter row (0-" + (dim - 1) + "): ");
            int x = scan.nextInt();
            System.out.print("Enter column (0-" + (dim - 1) + "): ");
            int y = scan.nextInt();

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

        // result section
        System.out.println("\n======= RESULT =======");
        printArray(board);
        System.out.println("X - " + name1);
        System.out.println("O - " + name2 + "\n");

        if (winner.isEmpty()) {
            System.out.println("Match draw!");
        } else {
            System.out.println("Congratulations, \"" + winner + "\" won the game!");
        }

        System.out.println("=======================");
    }
}

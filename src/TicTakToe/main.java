package TicTakToe;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        // insert names
        Scanner in = new Scanner(System.in);

        System.out.println("Player 1, whats your name: ");
        String p1 = in.nextLine();

        System.out.println("Player 2, whats your name: ");
        String p2 = in.nextLine();

        // create board
        char[][] board = new char[3][3];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '-';
            }
        }

        // Keep track of whose turn it is
        boolean isPlayer1 = true;

        // Keep track of whose turn it is
        boolean gameEnded = false;

        // create board
        drawBoard(board);

        while (!gameEnded) {

            // Keep track of what symbol we are yousing to play
            char symbol = ' ';
            if (isPlayer1) {
                symbol = 'x';
            } else
                symbol = 'o';

            if (isPlayer1) {
                System.out.println(p1 + "`s turn (x)");
            } else
                System.out.println(p2 + "`s turn (o)");

            int row = 0;
            int col = 0;

            while (true) {
                // Get row and col from user
                System.out.println("Enter a row (1 or 2 or 3)");
                row = in.nextInt();
                row--;
                System.out.println("Enter a col (1 or 2 or 3)");
                col = in.nextInt();
                col--;
                if (row < 0 || row > 2 || col < 0 || col > 2) {
                    System.out.println("Your row o col are out of bands");
                } else if (board[row][col] != '-') {
                    System.out.println("Someone has already made a move there!");
                } else {
                    break;
                }
            }
            board[row][col] = symbol;
            drawBoard(board);

            // Check if a player has won
            if (hasWon(board) == 'x') {
                System.out.println(p1 + " won");
                gameEnded = true;
            } else if (hasWon(board) == 'o') {
                System.out.println(p2 + " won");
                gameEnded = true;

            } else {
                if (hasTied(board)) {
                    System.out.println("Nobody wins");
                    gameEnded = true;
                } else {
                    isPlayer1 = !isPlayer1;
                }
            }
        }
    }

    private static void drawBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {

            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();

        }
    }

    private static char hasWon(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0] != '-') {
                return board[i][0];
            }
        }

        for (int j = 0; j < board.length; j++) {
            if (board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j] != '-') {
                return board[0][j];
            }
        }

        for (int j = 0; j < board.length; j++) {
            if (board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[1][1] != '-') {
                return board[0][0];
            }
        }

        for (int j = 0; j < board.length; j++) {
            if (board[2][0] == board[1][1] && board[1][1] == board[0][2] && board[1][1] != '-') {
                return board[2][0];
            }
        }

        return '-';
    }

    private static boolean hasTied(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {

                if (board[i][j] == '-') {
                    return false;
                }
            }
        }
        return true;
    }
}

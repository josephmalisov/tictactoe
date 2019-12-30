package com.joemalisov.tictactoe;

public class Board {

    private String[][] board;

    public String[][] getBoard() {
        return this.board;
    }

    public void setBoard(String[][] board) {
        this.board = board;
    }

    Board() {
        board = new String[3][3];
    }

    Board(String[][] board) {
        this.board = board;
    }

    public boolean check() { // TODO: find a more efficient way to do this
        // double for loop for checking if a row wins
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (!board[i][j].equals("") && (j == 0 || board[i][j].equals(board[i][j - 1]))) {
                    if (j == board.length - 1) {
                        return true;
                    }
                    continue;
                } else
                    break;
            }
        }

        // double for loop for checking if a column wins
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (!board[i][j].equals("") && (i == 0 || board[i][j].equals(board[i - 1][j]))) {
                    if (i == board.length - 1) {
                        return true;
                    }
                    continue;
                } else
                    break;
            }
        }

        // checks if diagonal wins left to right
        for (int i = 0; i < board.length; i++) {
            int j = i;
            if (!board[i][j].equals("") && (i == 0 || board[i][j].equals(board[i - 1][j - 1]))) {
                if (i == board.length - 1) {
                    return true;
                }
                continue;
            }
        }

        // checks if diagonal wins right to left
        for (int i = board.length - 1; i > -1; i--) {
            int j = board.length - (i + 1);
            if (!board[i][j].equals("") && (j == 0 || board[i][j].equals(board[i + 1][j - 1]))) {
                if (j == board.length - 1) {
                    return true;
                }
                continue;
            }
        }
        return false;
    }
}
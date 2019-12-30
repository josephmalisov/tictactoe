package com.joemalisov.tictactoe;

public class Board {

    String[][] board;

    Board() {
        board = new String[3][3];
    }

    Board(String[][] board) {
        this.board = board;
    }

    public boolean check() { //TODO: find a more efficient way to do this
        //double for loop for checking if a row wins
        for (int i = 0 ; i < board.length; i++) {
            for (int j = 0; j< board.length; j++) {
                if (!board[i][j].equals("") && (j == 0 || board[i][j].equals(board[i][j-1]))) {
                    if (j == board.length - 1) {
                        return true;
                    }
                    continue;
                }
                else break;
            }
        }

        //double for loop for checking if a column wins
        for (int i = 0 ; i < board.length; i++) {
            for (int j = 0; j< board.length; j++) {
                if (!board[i][j].equals("") && (i == 0 || board[i][j].equals(board[i-1][j]))) {
                    if (i == board.length - 1) {
                        return true;
                    }
                    continue;
                }
                else break;
            }
        }
        return false;
    }
}
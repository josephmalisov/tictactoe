package com.joemalisov.tictactoe;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BoardTests {

    @Test
    public void everything() {
        String[] row1 = new String[] {"x","x","x"};
        String[] row2 = new String[] {"x","x","x"};
        String[] row3 = new String[] {"x","x","x"};
        String[][] arrays = new String[][] {row1, row2, row3};
        Board board = new Board(arrays);
        assertTrue(board.check());
    }

    @Test
    public void threeInRow() {
        String[] row1 = new String[] {"x","x","x"};
        String[] row2 = new String[] {"","",""};
        String[] row3 = new String[] {"","",""};
        String[][] arrays = new String[][] {row1, row2, row3};
        Board board = new Board(arrays);
        assertTrue(board.check());

        row1 = new String[] {"","","x"};
        row2 = new String[] {"","",""};
        row3 = new String[] {"","",""};
        arrays = new String[][] {row1, row2, row3};
        board = new Board(arrays);
        assertFalse(board.check());
    }

    @Test
    public void threeInColumn() {
        String[] row1 = new String[] {"x","",""};
        String[] row2 = new String[] {"x","",""};
        String[] row3 = new String[] {"x","",""};
        String[][] arrays = new String[][] {row1, row2, row3};
        Board board = new Board(arrays);
        assertTrue(board.check());
    }
}
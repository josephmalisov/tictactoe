package com.joemalisov.tictactoe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TictactoeApplication {


	public static void main(String[] args) {
		String[] row1 = new String[] {"x","",""};
        String[] row2 = new String[] {"x","",""};
        String[] row3 = new String[] {"x","",""};
        String[][] arrays = new String[][] {row1, row2, row3};
        Board board = new Board(arrays);
        Boolean bool = board.check();
		SpringApplication.run(TictactoeApplication.class, args);
	}

}

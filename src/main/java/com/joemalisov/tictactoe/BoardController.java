package com.joemalisov.tictactoe;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    String[] row1 = new String[] { "x", "", "" };
    String[] row2 = new String[] { "", "x", "" };
    String[] row3 = new String[] { "x", "", "x" };
    String[][] arrays = new String[][] { row1, row2, row3 };
    Board board = new Board(arrays);

    @GetMapping("/")
    public String board(Model model) {
        model.addAttribute("board", board);
        return "board";
    }
}
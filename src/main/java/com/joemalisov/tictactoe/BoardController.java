package com.joemalisov.tictactoe;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BoardController {

    String newThing;
    int row = -1;
    int col = -1;

    String[] row1 = new String[] { "x", "", "" };
    String[] row2 = new String[] { "", "x", "" };
    String[] row3 = new String[] { "x", "x", "" };
    String[][] arrays = new String[][] { row1, row2, row3 };
    Board board = new Board(arrays);

    @GetMapping("/")
    public String board(Model model) {
        model.addAttribute("board", board);
        // model.addAttribute("row", row);
        // model.addAttribute("col", col);
        model.addAttribute("winbool", board.check());
        return "board";
    }

    @PostMapping("/")
    public String board(@ModelAttribute Board newBoard)
            throws Exception {
        board = newBoard;
        return "/";
    }
}
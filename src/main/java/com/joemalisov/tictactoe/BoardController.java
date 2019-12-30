package com.joemalisov.tictactoe;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

    Board board = new Board();

    @GetMapping("/")
    public String board(Model model) {
        // model.addAttribute("board", board);
        return "board";
    }
}
package com.example.tictactoe;

import javax.swing.*;

public class TicTacToe {
    public TicTacToe() {
        JFrame frame = new JFrame("Tic-Tac-Toe 🎮");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(new GameBoard());
        frame.setVisible(true);
    }
}

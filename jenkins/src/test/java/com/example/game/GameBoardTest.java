package com.example.tictactoe;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameBoardTest {

    @Test
    public void testBoardStartsEmpty() {
        GameBoard board = new GameBoard();
        assertNotNull(board);
    }
}

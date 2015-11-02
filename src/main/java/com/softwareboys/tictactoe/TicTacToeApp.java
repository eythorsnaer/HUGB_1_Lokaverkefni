package is.softwareboys.tictactoe;

import java.util.Scanner;

public class TicTacToeApp {
        private char[][] grid;
        private char currentPlayer;
        private int gridSize;

        TicTacToeApp()
        {
                currentPlayer = 'X';
                gridSize = 3;
                grid = new char[gridSize][gridSize];
        }

        public char getPlayer()
        {
                return currentPlayer;
                // Does not need refactoring
        }
}

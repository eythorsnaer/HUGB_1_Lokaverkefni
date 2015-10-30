package is.softwareboys.tictactoe;

public class TicTacToe {
	private char[][] grid;
	private char currentPlayer;
	private int gridSize;

	TicTacToe()
	{
		currentPlayer = 'X';
		//gridSize = 3;
	}

	public char getPlayer()
	{
		return currentPlayer;
		//does not need refactoring
	}
/*
	public char getSlot(int i, int j)
	{
		return grid[i][j];
		//does not need refractoring
	}*/
}


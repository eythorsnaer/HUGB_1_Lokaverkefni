package is.softwareboys.tictactoe;

public class TicTacToe {
	private char[][] grid;
	private char currentPlayer;

	TicTacToe()
	{
		currentPlayer = 'X';
	}

	public char getPlayer()
	{
		return currentPlayer;
		// Does not need refactoring
	}


}


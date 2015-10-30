package is.softwareboys.tictactoe;

public class TicTacToe {
	private char[][] grid;
	private char currentPlayer;

	TicTacToe()
	{
		currentPlayer = 'X';
		grid = new char[3][3];
		initialize();
	}

	public char getPlayer()
	{
		return currentPlayer;
		// Does not need refactoring
	}

	public char getSlot(int i, int j)
	{
		return grid[i][j];
		// Does not need refractoring
	}

	public void initialize()
	{
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				grid[i][j] = '-';
			}
		}
	}

}


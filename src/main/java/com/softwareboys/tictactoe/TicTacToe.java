package is.softwareboys.tictactoe;

public class TicTacToe {
	private char[][] grid;
	private char currentPlayer;
	private int gridSize;

	TicTacToe()
	{
		currentPlayer = 'X';
		gridSize = 3;
		grid = new char[gridSize][gridSize];
		initialize();
	}

	public char getPlayer()
	{
		return currentPlayer;
		//does not need refactoring
	}

	public char getSlot(int i, int j)
	{
		return grid[i][j];
		//does not need refractoring
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


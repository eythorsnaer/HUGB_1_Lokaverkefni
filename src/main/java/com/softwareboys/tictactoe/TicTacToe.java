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
		// Does not need refactoring
	}

	public char getSlot(int i, int j)
	{
		return grid[i][j];
		// Does not need refractoring
	}

	public void initialize()
	{
		for(int i = 0; i < gridSize; i++)
		{
			for(int j = 0; j < gridSize; j++)
			{
				grid[i][j] = '-';
			}
		}
	}

	public void print()
	{
		String gridString = getGridAsString();
		System.out.println(gridString);
	}

	public String getGridAsString()
	{
		 String result = "";

		 for (int i = 0; i < gridSize; i++)
		 {
			 for (int j = 0; j < gridSize; j++)
			 {
				 result += grid[i][j];
				 if (j != 2)
				 {
					 result += " ";
				 }
			 }
			 if (i != 2)
			 {
				 result += "\n";
			 }
		 }

		 return result;
	}

	public static void main(String[] args)
	{

	}
}


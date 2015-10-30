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

	public void putSlot(int i, int j, char c)
	{
		grid[i][j] = c;
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
		System.out.println(getGridAsString());
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

	public void changePlayer() 
	{
		if(currentPlayer == 'X')
		{
			currentPlayer = 'O';
		}
		else 
		{
			currentPlayer = 'X';
		}
	}

	public boolean isVertical() 
	{
		int count = 0;
		for(int i = 0 ; i < gridSize ; i++) 
		{
			for(int j = 0 ; j < gridSize ; j++) 
			{
				if(grid[i][j] == currentPlayer) 
				{
					count++;
				}
			}
			if(count == gridSize) 
			{
				return true;
			}
			else 
			{
				count = 0;
			}
		}
		return false;
	}

	public boolean isHorizontal() 
	{
		int count = 0;
		for(int i = 0 ; i < gridSize ; i++) 
		{
			for(int j = 0 ; j < gridSize ; j++) 
			{
				if(grid[j][i] == currentPlayer) 
				{
					count++;
				}
			}
			if(count == gridSize) 
			{
				return true;
			}
			else 
			{
				count = 0;
			}
		}
		return false;
	}

	public boolean isDiagonal() 
	{
		int count = 0;
		for(int i = 0; i < gridSize ; i++) 
		{
			if(grid[i][i] == currentPlayer) 
			{
				count++;
			}
		}
		
		if(count == gridSize) 
		{
			return true;
		}

		count = 0;
		
		for(int i = gridSize - 1, j = 0 ; i >= 0 || j < gridSize ; i--, j++) 
		{
			if(grid[j][i] == currentPlayer) {
				count++;
			}
		}
		
		if(count == gridSize) 
		{
			return true;
		}

		return false;
	}

	public void isWinner() 
	{

	}

}


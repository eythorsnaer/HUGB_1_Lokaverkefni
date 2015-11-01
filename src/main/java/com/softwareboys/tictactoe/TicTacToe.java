package is.softwareboys.tictactoe;

import java.util.Scanner;

public class TicTacToe {
	private char[][] grid;
	private char currentPlayer;
	private int gridSize;
	public boolean isOver;
	public boolean isValidMove;
	private int numberOfTurnsLeft;
	public boolean isOverDraw;

	TicTacToe()
	{
		currentPlayer = 'X';
		gridSize = 3;
		grid = new char[gridSize][gridSize];
		initialize();
		numberOfTurnsLeft = gridSize * gridSize;
		isOver = false;
		isValidMove = false;
		isOverDraw = false;
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
		System.out.println();
		System.out.println(getGridAsString());
		System.out.println();
	}

	public String getGridAsString()
	{
		 String result = "";

		 for(int i = 0; i < gridSize; i++)
		 {
			 for (int j = 0; j < gridSize; j++)
			 {
				 result += grid[i][j];
				 if (j != gridSize - 1)
				 {
					 result += " ";
				 }
			 }
			 if(i != gridSize - 1)
			 {
				 result += " \n";
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
		for(int i = 0; i < gridSize ; i++)
		{
			for(int j = 0; j < gridSize ; j++)
			{
				if(grid[i][j] == currentPlayer)
				{
					count++;
				}
			}
			if(count == 3)
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
		for(int i = 0; i < gridSize ; i++)
		{
			for(int j = 0; j < gridSize ; j++)
			{
				if(grid[j][i] == currentPlayer)
				{
					count++;
				}
			}
			if(count == 3)
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
		for(int i = 0; i < gridSize; i++)
		{
			if(grid[i][i] == currentPlayer)
			{
				count++;
			}
		}

		if(count == 3)
		{
			return true;
		}

		count = 0;

		for(int i = gridSize - 1, j = 0; i >= 0 || j < gridSize; i--, j++)
		{
			if(grid[j][i] == currentPlayer)
			{
				count++;
			}
		}

		if(count == 3)
		{
			return true;
		}

		return false;
	}

	public void isWinner()
	{
		if(isHorizontal() || isDiagonal() || isVertical())
		{
			isOver = true;
		}
	}

	public void move(int i, int j)
	{
		moveIsValid(i, j);

		if(isValidMove)
		{
			grid[i][j] = currentPlayer;
			print();
			numberOfTurnsLeft--;
			isWinner();
			changePlayer();
		}
		if(numberOfTurnsLeft == 0 && isOver == false) 
		{
			isOverDraw = true;
		}
	}

	public void printInvalidMoveMessage()
	{
		System.out.println();
		System.out.println("That is not a valid coordinate, please enter a new one!");
		System.out.println();
	}

	public void moveIsValid(int i, int j)
	{
		if(i < gridSize && j < gridSize && i >= 0 && j >= 0)
		{
			if(grid[i][j] == '-')
			{
				isValidMove = true;
			}
			else
			{
				System.out.println();
				System.out.println("That spot is already taken, try again");
				System.out.println();
			}
		}
		else
		{
			printInvalidMoveMessage();
			isValidMove = false;
		}
		if(numberOfTurnsLeft == 0)
		{
			isOverDraw = true;
		}
	}

	public String findWinner()
	{
		if(isOverDraw)
		{
			return "It's a draw!";
		}
		else
		{
			changePlayer();
			return "The winner is " + getPlayer() + "!";
		}
	}

	public void declareWinner()
	{
		System.out.println();
		System.out.println(findWinner());
		System.out.println();
	}

	public boolean isNumeric(String str)
	{
	  try
	  {
	    int d = Integer.parseInt(str);
	  }
	  catch(NumberFormatException exception)
	  {
	    return false;
	  }
	  return true;
	}

	public void play()
	{
		Scanner in = new Scanner(System.in);
		int a, b;

		while (isOver == false && isOverDraw == false)
		{
			do
			{
				System.out.println();
				System.out.println("It's " + getPlayer() + "'s turn!");
				System.out.println();

				isValidMove = false;

				String i, j;

				i = in.next();
				j = in.next();

				if (isNumeric(i) && isNumeric(j))
				{
					a = Integer.parseInt(i);
					b = Integer.parseInt(j);
					move(a, b);
				}
				else
				{
					printInvalidMoveMessage();
				}
			}
			while (isValidMove == false);
		}
		in.close();
	}

	public void printWelcomeMessage()
	{
		System.out.println();
		System.out.println("Welcome to Tic Tac Toe!");
		System.out.println("This game was made by S O F T W A R E B O Y S");
		System.out.println();
	}

	public static void main(String[] args)
	{
		TicTacToe game = new TicTacToe();
		game.printWelcomeMessage();
		game.print();
		game.play();
		game.declareWinner();
	}
}

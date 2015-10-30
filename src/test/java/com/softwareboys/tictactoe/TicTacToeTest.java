package is.softwareboys.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicTacToeTest {

    //blabla
    TicTacToe game;


    @Test
	public void constructorTest()
	{
		game = new TicTacToe();

		// Test if initial player is X
		assertEquals('X', game.getPlayer());
	}

	@Test
	public void constructorTestInitalized()
	{
		game = new TicTacToe();

		// Test if grid is of correct size
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				assertEquals('-', game.getSlot(i, j));
			}
		}
	}

	@Test
	public void printStringTest()
	{
		game = new TicTacToe();

		assertEquals("- - -\n- - -\n- - -", game.getGridAsString());
	}

	@Test
	public void isCorrectPlayerTest() 
	{
		game = new TicTacToe(); 

		game.changePlayer();

		assertEquals('O', game.getPlayer());

	}

	@Test
	public void isVerticalTest() {
		game = new TicTacToe();

		game.grid[0][0] = 'X';
		game.grid[0][1] = 'X';
		game.grid[0][2] = 'X';

		assertEquals(true, game.isVertical());
	}
}

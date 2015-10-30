package is.softwareboys.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicTacToeTest {

    
    TicTacToe game;


    @Test
	public void constructorTest()
	{
		game = new TicTacToe();

		//Test if initial player is X
		assertEquals('X', game.getPlayer());

		//Test if grid is of correct size
		/*
		for(int i = 0; i < 3; i++)
		{
			for(int j = 0; j < 3; j++)
			{
				assertEquals('-', game.getSlot(i, j));
			}
		}
		*/
	}

}

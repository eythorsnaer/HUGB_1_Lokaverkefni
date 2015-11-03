package is.softwareboys.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicTacToeTest {

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

<<<<<<< HEAD
		assertEquals("- - - \n- - - \n- - -", game.getGridAsString());
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

		game.putSlot(0, 0, 'X');
		game.putSlot(0, 1, 'X');
		game.putSlot(0, 2, 'X');

		assertEquals(true, game.isVertical());
	}

	@Test
	public void isHorizontalTest() {
		game = new TicTacToe();
		game.putSlot(0, 0, 'X');
		game.putSlot(1, 0, 'X');
		game.putSlot(2, 0, 'X');

		assertEquals(true, game.isHorizontal());
	}

	@Test
	public void isDiagonalTest() {
		game = new TicTacToe();
		game.changePlayer();
		game.putSlot(0, 0, 'O');
		game.putSlot(1, 1, 'O');
		game.putSlot(2, 2, 'O');

		assertEquals(true, game.isDiagonal());
	}

	@Test
	public void isDiagonal2Test() {
		game = new TicTacToe();
		game.changePlayer();
		game.putSlot(0, 0, 'O');
		game.putSlot(1, 1, 'O');
		game.putSlot(2, 2, 'O');

		assertEquals(true, game.isDiagonal());
	}

	@Test
	public void moveTest()
	{
		game = new TicTacToe();

		//test if change in valid grid

			char temp = game.getPlayer();
			assertEquals('-', game.getSlot(1,1));
			game.move(1, 1);
			assertEquals(temp, game.getSlot(1,1));
	}

	@Test
	public void isDrawTest()
	{
		game = new TicTacToe();
		game.move(0, 0);
		game.move(0, 1);
		game.move(1, 0);
		game.move(2, 0);
		game.move(1, 1);
		game.move(2, 2);
		game.move(0, 2);
		game.move(1, 2);
		game.move(2, 1);

		assertEquals("It's a draw!", game.findWinner());
	}

  @Test
  public void isNumericTest1()
  {
    game = new TicTacToe();

    assertEquals(true, game.isNumeric("1"));
  }

  @Test
  public void isNumericTest2()
  {
    game = new TicTacToe();

    assertEquals(false, game.isNumeric("k"));
  }
=======
		assertEquals("- - -\n- - -\n- - -", game.getGridAsString());
	}
>>>>>>> bbffbb/master

}

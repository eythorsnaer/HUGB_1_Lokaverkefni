package is.softwareboys.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicTacToeAppTest {

        TicTacToe game;


	@Test
        public void constructorTest()
        {
                game = new TicTacToe();

                // Test if initial player is X
                assertEquals('X', game.getPlayer());
        }









}

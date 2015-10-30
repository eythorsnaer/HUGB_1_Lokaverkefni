package is.softwareboys.tictactoe;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TicTacToeTest {

    
    TicTacToe game;


    @Test
    public void constructorTest() {
	game = new TicTacToe();
	assertEquals('X', game.getPlayer());
    }

}

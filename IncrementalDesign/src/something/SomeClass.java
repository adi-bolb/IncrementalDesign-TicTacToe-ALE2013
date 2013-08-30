package something;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeClass {

	@Test
	public void FirstPlayerPlaysAndWins(){
		TicTacToeGame ticTacToe = new TicTacToeGame();
		
		ticTacToe.play("X");
		
		assertEquals("X", ticTacToe.winner());
	}
}

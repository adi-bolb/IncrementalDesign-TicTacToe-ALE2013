package something;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeClass {

	@Test
	public void FirstPlayerIsX(){
		TicTacToeGame ticTacToe = new TicTacToeGame();
		
		assertEquals("X", ticTacToe.currentPlayer());
	}
	
	@Test
	public void FirstPlayerPlaysAndWins(){
		TicTacToeGame ticTacToe = new TicTacToeGame();
		
		ticTacToe.play();
		
		assertEquals("X", ticTacToe.winner());
	}
}

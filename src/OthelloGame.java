/**
 * this class represents an othello game
 * 
 * @author Laban Benoit - Veyre Aurelien
 *
 */
public class OthelloGame 
{
	
	/**
	 * create a new game ready to be played with a board 8x8 and four pawns(2 black in D5 and E4, 2 white in D4 and E5)
	 */
	public OthelloGame()
	{
		private final 
		
		this.board = new Board();
		this.player1 = new Player();
		this.player2 = new Player();
		
	}
	
	/**
	 * play the game:
	 * 
	 * current player is player1
	 * while <board isn't full>
	 *  while <one pawn of opponent can be framed>
	 *   <ask to current player where to play>
	 * 	 if<this location is right>
	 *    <a pawn of the current player is put>
	 *    <every framed opponents pawn change of color>
	 * 	 else
	 *    <ask to current player a new location>
	 *   current player changes
	 *  current player changes
	 * game over
	 */
	public void play()
	{
		while (EmptyBoard())
		{
			while
		}
	}	
	
	
	
}



/**
 * this class represents an othello game
 * 
 * @author Laban Benoit - Veyre Aurelien
 *
 */
public class OthelloGame 
{
	/**
	 * board of othello game
	 */
	private final Board board;
	
	/**
	 * first player
	 */
	private Player player1;
	
	/**
	 * second player
	 */
	private Player player2;

	/**
	 * create a new game ready to be played with a board 8x8 and four pawns(2
	 * black in D5 and E4, 2 white in D4 and E5)
	 * @param nameP1 : the name of the first player
	 * @param nameP2 : the name of the second player
	 */
	public OthelloGame(String nameP1, String nameP2)
	{
		this.board = new Board();
		this.player1 = new Player(nameP1);
		this.player2 = new Player(nameP2);
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
		while (EmptyBoard(this.board)== true)
		{
			while
		}
	}

}

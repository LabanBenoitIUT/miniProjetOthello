import java.util.Scanner;

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
	private final Board board[][];
	/**
	 * first player
	 */
	private Player player1;
	/**
	 * second player
	 */
	private Player player2;
	/**
	 * create a new game ready to be played with a board 8x8 and four pawns(2 black in D5 and E4, 2 white in D4 and E5)
	 */
	public OthelloGame()
	{
		this.board = new Board[8][8];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the first player's name" );
		String str1 = sc.nextLine();
		this.player1 = new Player(str1);
		System.out.println("enter the second player's name" );
		String str2 = sc.nextLine();
		this.player2 = new Player(str2);	
	}
	// TODO update comment
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

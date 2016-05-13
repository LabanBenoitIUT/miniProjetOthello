

/**
 * this class represents an Othello game
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
	 * team's number of current player
	 */
	private Player currentPlayer;
	
	/**
	 * Change the current player
	 */
	public void ChangeCurrentPlayer()
	{
		if(this.currentPlayer == this.player1)
			this.currentPlayer = this.player2;
		else
			this.currentPlayer = this.player1;
	}

	/**
	 * check if the game is over: statement of the board should be not full and at least one of players can play
	 * @return true if it isn't else false
	 */
	public boolean gameIsNotOver()
	{
		if(this.board.IsEmpty())
		{
			if(CanPlay(this.player1)||CanPlay(this.player2))
				return true;
		}
		return false;
	}
	
	/**
	 * 
	 * @param player
	 * @return
	 */
	public boolean CanPlay(Player player)
	{
		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 8; j++)
			{
				if(this.board.pawnCanFramed(this.board.board[i][j], player, i, j))
					return true;
			}
		}
		return false;
	}
	
	/**
	 * create a new game ready to be played with a board 8x8 and four pawns(2
	 * black in D5 and E4, 2 white in D4 and E5)
	 * @param nameP1 : the name of the first player
	 * @param nameP2 : the name of the second player
	 */
	public OthelloGame(String nameP1, String nameP2)
	{
		this.board = new Board();
		this.player1 = new Player(nameP1, 1);
		/*this.player1.wherePlay[0] = new Coordinate(4,2);
		this.player1.wherePlay[1] = new Coordinate(5,3);
		this.player1.wherePlay[2] = new Coordinate(3,5);
		this.player1.wherePlay[3] = new Coordinate(2,4);
		this.player1.HisPawn[0] = new Coordinate(3,3);
		this.player1.HisPawn[1] = new Coordinate(4,4);*/
		this.player2 = new Player(nameP2, 2);
		/*this.player2.wherePlay[0] = new Coordinate(2,3);
		this.player2.wherePlay[1] = new Coordinate(3,2);
		this.player2.wherePlay[2] = new Coordinate(4,5);
		this.player2.wherePlay[3] = new Coordinate(5,4);
		this.player2.HisPawn[0] = new Coordinate(3,4);
		this.player2.HisPawn[1] = new Coordinate(4,3);*/
	}

	/**
	 * play the game:
	 * 
	 * current player is player1
	 * while <game is not over>
	 *  while <Canplay>
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
		this.currentPlayer = this.player1;
		while(gameIsNotOver())
		{
			while(CanPlay(this.currentPlayer))
			{
				/* ask to current player where to play*/
				while(this.board.locationIsRight()  == false)
				{
					/* ask to current player where to play*/
				}
				/*this.board[i][j] = this.currentPlayer;*/
				/*change color*/
				ChangeCurrentPlayer();
			}
			ChangeCurrentPlayer();
		}
		this.board.TheWinnerIs();
	}

	
}

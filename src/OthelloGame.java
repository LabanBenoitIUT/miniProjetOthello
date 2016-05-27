

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
		{
			this.player1 = this.currentPlayer;
			this.currentPlayer = this.player2;
		}
		else
		{
			this.player2 = this.currentPlayer;
			this.currentPlayer = this.player1;
		}
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
	 * check if the player can play
	 * @param player current player
	 * @return true if the player can play
	 */
	public boolean CanPlay(Player player)
	{
		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 8; j++)
			{
				if(this.board.pawnCanFramed(player, i, j))
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
		this.player2 = new Player(nameP2, 2);
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
				Coordinate c = null;
				try
				{
					c = this.currentPlayer.askWherePlay();
				}
				catch (CoordinateIsntInTheBoardException e)
				{
					System.out.println("la coordonnée n'est pas valide");
				}
				while(this.board.locationIsRight(c, this.currentPlayer)  == false)
				{
					try
					{
						c = this.currentPlayer.askWherePlay();
					}
					catch (CoordinateIsntInTheBoardException e)
					{
						System.out.println("la coordonnée n'est pas valide");
					}
				}
				this.board.getBoard()[c.getX()][c.getY()] = this.currentPlayer.getTeam();
				this.board.ChangeColor(this.currentPlayer, c.getX(), c.getY());
				ChangeCurrentPlayer();			}
			ChangeCurrentPlayer();
		}
		this.board.TheWinnerIs();
	}	
}
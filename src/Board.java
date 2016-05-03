/**
 * this class represents a square board 8x8
 * 
 * @author Laban Benoit Veyre Aurelien
 *
 */
public class Board
{	
	/**
	 * a board of pawn 
	 */
	int[][] board = new int[8][8];
	
	/**
	 * create a table of pawns with the initial pawn 
	 */
	public Board()
	{
		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 8; j++)
			{
				this.board[i][j] = 0;
			}
		}
		this.board[3][3] = 1;
		this.board[3][4] = 2;
		this.board[4][3] = 2;
		this.board[4][4] = 1;	
	}
	/**
	 * check if the board is empty
	 * @param board : the board
	 * @return true if the board is not full and else false 
	 */
	public boolean IsEmpty(int[][] board)
	{
		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 8; j++)
			{
				if(this.board[i][j] == 0)
					return true;
			}
		}
		return false;
	}
	
	/**
	 * change the owner of the pawn
	 * @param co the coordinate of a pawn  
	 */
	public void switchTeam(Coordinate co)
	{
		if (this.board[co.getX()][co.getY()] == 1)
			this.board[co.getX()][co.getY()] = 2;
			else this.board[co.getX()][co.getY()] = 1;
	}
	
	/**
	 * check if a pawn can be framed by opponents pawns
	 * @param team : the team of the current player
	 * @return true if it can be framed and else false
	 */
	public boolean pawnCanBeFramed(int team)
	{
		
		return true;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean locationIsRight()
	{
		
		return true;
	}
	
	/**
	 * 
	 * @return
	 */
	public int TheWinnerIs()
	{
		int nb1 = 0;
		int nb2 = 0;
		int results = 0;
		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 8; j++)
			{
				if(this.board[i][j] == 1)
					nb1++ ;
				else if(this.board[i][j] == 2)
					nb2++;
			}
			if(nb1 > nb2)
			{
				results = 1;
			}
			else if(nb1 < nb2)
			{
				results = 2;
			}
		}
		return results;		
	}


}

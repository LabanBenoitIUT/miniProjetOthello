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
	Pawn[][] board;
	
	/**
	 * true if the board is not full and else false
	 */
	private boolean isNotFull;
	/**
	 * create a table of pawns with the initial pawn 
	 * @return board with the initials pawns 
	 */
	public Board()
	{
		this.board[8][8] = null;
		board[3][3] = new Pawn(1);
		board[3][4] = new Pawn(2);
		board[4][3] = new Pawn(2);
		board[4][4] = new Pawn(1);	
	}
	/**
	 * check if the board is empty
	 * @param board 
	 * @return true if the board is not full and else false 
	 */
	public boolean EmptyBoard(Pawn[][] board)
	{
		for (int i = 0; i < 8; i++)
		{
			for (int j = 0; j < 8; j++)
			{
				if(this.board[i][j] == null)
					return true;
			}
		}
		return false;
	}
	public boolean isNotFull()
	{
		return isNotFull;
	}
	/**
	 * update the value of isNotFull
	 * @param isNotFull  
	 */
	public void setNotFull(boolean isNotFull)
	{
		this.isNotFull = EmptyBoard(board) ;
	}
	
}

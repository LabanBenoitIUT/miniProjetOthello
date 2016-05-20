/**
 * this class represents a square board 8x8
 * 
 * @author Laban Benoit Veyre Aurelien
 *
 */
public class Board
{
	/**
	 * default value of the length of the board
	 */
	private final int DEFAULT_LENGTH=8;
	
	/**
	 * default value of the longer of the board
	 */
	private final int DEFAULT_LONG=8;
	/**
	 * a board of pawn 
	 */
	private int[][] board ;
	
	/**
	 * create a table of pawns with the initial pawn 
	 */
	public Board()
	{
		this.board = new int[this.DEFAULT_LENGTH][this.DEFAULT_LONG];
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
	 * @return true if the board is not full and else false 
	 */
	public boolean IsEmpty()
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
	 * @param p : a pawn
	 * @param player 
	 * @param i 
	 * @param j 
	 * @return true if it can be framed and else false
	 */
	public boolean pawnCanFramed(int[][] p, Player player, int i, int j)
	{
		int k=0;
		int x=i;
		int y=j;
		int team=player.getTeam();
		int t2=team;
		
		while(x<8 && t2!=team)
		{
			x++;
			t2 = this.board[x][j];
		}
		if(t2 == 0)
		{
			player.WherePlay[k].setX(x);
			player.WherePlay[k].setY(j);
			k++;
		}
		else
		{
			t2=team;
			x=i;
			while(x>=0 && t2!=team)
			{
				x--;
				t2 = this.board[x][j];
			}
			if(t2 == 0)
			{
				player.WherePlay[k].setX(x);
				player.WherePlay[k].setY(j);
				k++;
			}
		}
		
		t2=team;
		while(y<8 && t2!=team)
		{
			y++;
			t2 = this.board[i][y];
		}
		if(t2 == 0)
		{
			player.WherePlay[k].setX(i);
			player.WherePlay[k].setY(y);
			k++;
		}
		else
		{
			t2=team;
			y=j;
			while(y>=0 && t2!=team)
			{
				y--;
				t2 = this.board[i][y];
			}
			if(t2 == 0)
			{
				player.WherePlay[k].setX(i);
				player.WherePlay[k].setY(y);
				k++;
			}
		}
		
		x=i;
		y=j;
		t2=team;
		while(x<8 && y<8 && t2!=team)
		{
			x++;
			y++;
			t2 = this.board[x][y];
		}
		if(t2 == 0)
		{
			player.WherePlay[k].setX(x);
			player.WherePlay[k].setY(y);
			k++;
		}
		
		x=i;
		y=j;
		t2=team;
		while(x>=0 && y>=0 && t2!=team)
		{
			x--;
			y--;
			t2 = this.board[x][y];
		}
		if(t2 == 0)
		{
			player.WherePlay[k].setX(x);
			player.WherePlay[k].setY(y);
			k++;
		}
		
		x=i;
		y=j;
		t2=team;
		while(x>=0 && y<8 && t2!=team)
		{
			x--;
			y++;
			t2 = this.board[x][y];
		}
		if(t2 == 0)
		{
			player.WherePlay[k].setX(x);
			player.WherePlay[k].setY(y);
			k++;
		}
		
		x=i;
		y=j;
		t2=team;
		while(x<8 && y>=0 && t2!=team)
		{
			x++;
			y--;
			t2 = this.board[x][y];
		}
		if(t2 == 0)
		{
			player.WherePlay[k].setX(x);
			player.WherePlay[k].setY(y);
			k++;
		}
		
		if(player.WherePlay[0] != null)
			return true;
		else
			return false;
	}
	
	/**
	 * 
	 * @param c the coordinate where the player want play
	 * @param player the current player
	 * @return true if the location is on the possible location and else return false
	 */
	public boolean locationIsRight(Coordinate c, Player player)
	{
		for(int i=0; i<61; i++)
		{
			if(c.getX()==player.WherePlay[i].getX() && c.getY()==player.WherePlay[i].getY())
			{
				return true;
			}
		}
		return false;
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
	
	/**
	 * 
	 * @return
	 */
	public int[][] getBoard()
	{
		return this.board;
	}
	/**
	 * @return the dEFAULT_LENGTH
	 */
	public int getDEFAULT_LENGTH()
	{
		return this.DEFAULT_LENGTH;
	}
	/**
	 * @return the dEFAULT_LONG
	 */
	public int getDEFAULT_LONG()
	{
		return this.DEFAULT_LONG;
	}
	
	
	


}

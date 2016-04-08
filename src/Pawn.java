/**
 * represent a pawn
 * @author Laban Benoît - Veyre Aurélien
 *
 */
public class Pawn
{

	/**
	 * number of the owner
	 */
	private int team;
	
	/**
	 * give a team number to the pawn
	 * @param numPlayer is the number of the owner
	 */
	public Pawn(int numPlayer)
	{
		this.team = numPlayer;
	}

	/**
	 * change the owner of the pawn
	 * @param pawn who must change of owner
	 */
	public void switchTeam(Pawn pawn)
	{
		if (this.team == 1)
			this.team = 2;
			else this.team = 1;
	}
	
	/**
	 * check if the pawn can be framed 
	 * @return true if he can be framed and else false
	 */
	public boolean pawnCanBeFramed()
	{
		
	}
}

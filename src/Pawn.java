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
	private int equipe;
	/**
	 * 
	 * @param numPlayer is the number of the owner
	 */
	public Pawn(int numPlayer)
	{
		this.equipe = numPlayer;
	}
	/**
	 * change the owner of the pawn
	 * @param pawn who must change of owner
	 */
	public void switchEquipe(Pawn pawn)
	{
		if (this.equipe == 1)
			this.equipe = 2;
			else this.equipe = 1;
	}
	
	/**
	 * 
	 * @return
	 */
	public boolean pawnCanBeFramed()
	{
		
	}
}

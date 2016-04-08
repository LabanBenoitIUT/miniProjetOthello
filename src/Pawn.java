/**
 * represent a pawn
 * @author Laban Benoît - Veyre Aurélien
 *
 */
public class Pawn
{
	// TODO rename field
	/**
	 * number of the owner
	 */
	private int equipe;
	
	// TODO fix comment (general description is missing)
	/**
	 * 
	 * @param numPlayer is the number of the owner
	 */
	public Pawn(int numPlayer)
	{
		this.equipe = numPlayer;
	}
	// TODO rename method
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
	
	// TODO fix comment
	/**
	 * 
	 * @return
	 */
	public boolean pawnCanBeFramed()
	{
		
	}
}

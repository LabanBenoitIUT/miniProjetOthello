/**
 * represent a player
 * @author laban benoît veyre aurélien
 *
 */
public class Player
{
	/**
	 * name of player
	 */
	private final String name;
	
	/**
	 * indicate if the player had play the last round
	 */
	private boolean HadPlay;
	
	/**
	 * position where the player can play
	 */
	Coordinate[]wherePlay;
	
	/**
	 * position of all pawn of player
	 */
	Coordinate[]HisPawn;
	
	/**
	 * create a player with name in parameter
	 * @param name : is the name of the player 
	 */
	public Player(String name)
	{
		this.name = name;
		this.wherePlay[64] = null;
		this.HisPawn[64] = null;
	}

	/**
	 * get if the player had play the last round
	 * @return
	 */
	public boolean getHadPlay()
	{
		return HadPlay;
	}

	/**
	 * update the value of HadPlay
	 * @param hadPlay
	 */
	public void setHadPlay(boolean hadPlay)
	{
		HadPlay = hadPlay;
	}

}



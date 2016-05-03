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
	 * 
	 */
	private int team;
	
	/**
	 * indicate if the player had play the last round
	 */
	private boolean HadPlay;
	
	/**
	 * create a player with name in parameter
	 * @param name : is the name of the player 
	 */
	public Player(String name, int team)
	{
		this.team = team;
		this.name = name;
		this.HadPlay = true; 
	}

	/**
	 * 
	 * @return
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * get if the player had play the last round
	 * @return
	 */
	public boolean getHadPlay()
	{
		return this.HadPlay;
	}

	/**
	 * update the value of HadPlay
	 * @param hadPlay
	 */
	public void setHadPlay(boolean hadPlay)
	{
		this.HadPlay = hadPlay;
	}

}



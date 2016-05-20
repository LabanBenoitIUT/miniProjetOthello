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
	 * 
	 */
	Coordinate[] WherePlay = new Coordinate[60];

	/**
	 * create a player with name in parameter
	 * @param name : is the name of the player 
	 */
	public Player(String name, int team)
	{
		this.team = team;
		this.name = name;
		for (int i = 0; i < 61; i++)
		{
			this.WherePlay[i] = null; 
		}
	}

	/**
	 * 
	 * @return
	 */
	public String getName()
	{
		return this.name;
	}

	/**
	 * @return
	 */
	public int getTeam()
	{
		return this.team;
	}
	

}



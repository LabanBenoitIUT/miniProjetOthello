import java.util.Scanner;

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
	 * @param team the team of the player
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
	 * @return the name of the player
	 */
	public String getName()
	{
		return this.name;
	}

	/**
	 * @return the team of the player
	 */
	public int getTeam()
	{
		return this.team;
	}
	
	/**
	 * @return the coordinate where the player want play 
	 * @throws CoordinateIsntInTheBoardException if the coordinate is not on the board
	 */
	public Coordinate askWherePlay() throws CoordinateIsntInTheBoardException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Veuillez saisir un abscisse où jouer:");
		String abs = sc.nextLine();
		System.out.println("Veuillez saisir une ordonnée où jouer:");
		String ord = sc.nextLine();
		int x = Integer.parseInt(abs);
		int y = Integer.parseInt(ord);
		return new Coordinate(x, y);
	}

}



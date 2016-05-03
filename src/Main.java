/**
 * application who execute an othello game
 * @author benoit laban - aurelien veyre
 *
 */
public class Main {

	/**
	 * begin the game
	 * @param args the name of every players
	 */
	public static void main(String[] args) 
	{
		new OthelloGame(args[0], args[1]).play();
		System.out.println();
		
	}
	
}

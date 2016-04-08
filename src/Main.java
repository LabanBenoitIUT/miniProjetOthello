/**
 * application who execute an othello game
 * @author labanb
 *
 */
public class Main {

	/**
	 * begin the game
	 */
	public static void main(String[] args) 
	{
		new OthelloGame(args[0], args[1]).play();
		System.out.println();
		
	}
	
}

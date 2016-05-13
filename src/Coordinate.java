/**
 * 
 * @author VEYRE Aurelien , LABAN Benoit
 *
 */
public class Coordinate
{
	/**
	 * the horizontal coordinate
	 */
	private int x;
	
	/**
	 * the vertical coordinate
	 */
	private int y;
	
	/**
	 * 
	 * @param x
	 * @param y
	 */
	public Coordinate(int x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public int getX()
	{
		return x;
	}

	public void setX(int x)
	{
		this.x = x;
	}

	public int getY()
	{
		return y;
	}

	public void setY(int y)
	{
		this.y = y;
	}

}

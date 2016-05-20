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
	 * create a new coordinate
	 * @param x : value of x
	 * @param y : value of y
	 * @throws CoordinateIsntInTheBoardException if the coordinate is not on the board
	 */
	public Coordinate(int x, int y) throws CoordinateIsntInTheBoardException
	{
		if(x > 8 || x < 0 || y > 8 || y < 0 )
			throw new CoordinateIsntInTheBoardException();
		this.x = x;
		this.y = y;
	}

	/**
	 * get the value of x
	 * @return the value of x attribute
	 */
	public int getX()
	{
		return this.x;
	}

	
	/**
	 * update the value of x
	 * @param x new value of the y attribute
	 */
	public void setX(int x)
	{
		this.x = x;
	}

	/**
	 * get the value of y
	 * @return the value of y attribute
	 */
	public int getY()
	{
		return this.y;
	}

	/**
	 *  update the value of y
	 * @param y new value of the y attribute 
	 */
	public void setY(int y)
	{
		this.y = y;
	}

}
